# Que-me-pongo

## ¡Cuarta Iteración!

### Requerimientos
* Como usuarie de QuéMePongo, quiero poder conocer las condiciones climáticas de Buenos
Aires en un momento dado para obtener sugerencias acordes.
* Como usuarie de QuéMePongo, quiero poder recibir sugerencias de atuendos que tengan una
prenda para cada categoría, aunque a futuro podrán tener más (Ej.: Una remera, un pantalón,
zapatos y un gorro).
* Como usuarie de QuéMePongo, quiero que al generar una sugerencia las prendas sean
acordes a la temperatura actual sabiendo que para cada prenda habrá una temperatura hasta
la cual es adecuada. (Ej.: “Remera de mangas largas” no es apta a más de 20°C)
* Como administradore de QuéMePongo, quiero poder configurar fácilmente diferentes servicios
de obtención del clima para ajustarme a las cambiantes condiciones económicas.
* Como stakeholder de QuéMePongo, quiero poder asegurar la calidad de 1 mi aplicación sin
incurrir en costos innecesarios.

### Diagrama de la iteracion:
>  <IMG src="diagDeClasesIt4.jpeg">

### Diagrama de clases acumulado

>  <IMG src="diagDeClases.jpeg">
  
### Codigo: Proyecto de Java - Que-me-pongo
### Código de iteración simplificado y resumido:

```java
public class Usuario {
    String ciudad;
    List<Atuendo> atuendos = new ArrayList<Atuendo>();
    GeneradorDeSugerencias generadorDeSugerencias;
    ServicioDeClima servicioDeClima;


    public void agregarAtuendo(Atuendo atuendo){
        this.atuendos.add(atuendo);
    }
    public void generarAtuendo(Prenda superior,Prenda inferior,Prenda calzado, List<Prenda> accesorios){
        agregarAtuendo(new Atuendo(superior,inferior,calzado,accesorios));
    }

    public List<Atuendo> sugerenciasDelDia(){
        return this.generadorDeSugerencias.generarSugerencia(atuendos,this.servicioDeClima.obtenerTemperatura(ciudad));
    }


}

public class GeneradorDeSugerencias {

    public List<Atuendo> generarSugerencia(List<Atuendo> atuendos,int temperatura){
        return atuendos.stream().filter(atuendo -> atuendo.atuendoAptoTemperatura(temperatura))
                .collect(Collectors.toList());
    }
}


public final class AccuWeatherAPI {

    public final List<Map<String, Object>> getWeather(String ciudad) {
        return Arrays.asList(new HashMap<String, Object>(){{
            put("DateTime", "2019-05-03T01:00:00-03:00");
            put("EpochDateTime", 1556856000);
            put("WeatherIcon", 33);
            put("IconPhrase", "Clear");
            put("IsDaylight", false);
            put("PrecipitationProbability", 0);
            put("MobileLink", "http://m.accuweather.com/en/ar/villa-vil/7984/");
            put("Link", "http://www.accuweather.com/en/ar/villa-vil/7984");
            put("Temperature", new HashMap<String, Object>(){{
                put("Value", 57);
                put("Unit", "F");
                put("UnitType", 18);
            }});
        }});
    }
}

public interface ServicioDeClima {
    public List<Map<String, Object>> obtenerClima(String ciudad);
    public int obtenerTemperatura(String ciudad);
    public int convertirUnidades(int temperatura,String unidad);
    public boolean esDeHoy(List<Map<String, Object>> clima);

}

public class ServicioAccuWeather implements ServicioDeClima{
    AccuWeatherAPI servicioClima;
    List<Map<String, Object>> clima;
    @Override
    public List<Map<String, Object>> obtenerClima(String ciudad) {
        if(!esDeHoy(clima)){
            this.clima=servicioClima.getWeather(ciudad);
        }
        return clima;
    }
    //Todo
    //No se como manejar el esto, así que meto un hardcodeado loco
    //No, este no es el mock (pero falta aclarar esa duda).
    @Override
    public int obtenerTemperatura(String ciudad) {
        int temperatura=57;
        return convertirUnidades(temperatura,"F");
    }

    @Override
    public int convertirUnidades(int temperatura,String unidad){
        if(unidad=="F"){
            return (temperatura-32)*(5/9);
        }
        //Todo. A futuro pensar si se necesitan otros factores de converción.
        return temperatura;
    }

    //Todo
    @Override
    public boolean esDeHoy(List<Map<String, Object>> clima){
        return true;
    }
}

public class AcuMock implements ServicioDeClima{

    @Override
    public final List<Map<String, Object>> obtenerClima(String ciudad) {
        return Arrays.asList(new HashMap<String, Object>(){{
            put("DateTime", "2019-05-03T01:00:00-03:00");
            put("EpochDateTime", 1556856000);
            put("WeatherIcon", 33);
            put("IconPhrase", "Clear");
            put("IsDaylight", false);
            put("PrecipitationProbability", 0);
            put("MobileLink", "http://m.accuweather.com/en/ar/villa-vil/7984/");
            put("Link", "http://www.accuweather.com/en/ar/villa-vil/7984");
            put("Temperature", new HashMap<String, Object>(){{
                put("Value", 57);
                put("Unit", "F");
                put("UnitType", 18);
            }});
        }});
    }

    //Esto es un Mock. Necesito que me devuelva un valor cualquiera para testear (Y para evitar esos 0.5USD)
    @Override
    public int obtenerTemperatura(String ciudad) {
        int temperatura=57;
        return convertirUnidades(temperatura,"F");
    }

    @Override
    public int convertirUnidades(int temperatura,String unidad){
        if(unidad=="F"){
            return (temperatura-32)*(5/9);
        }
        return temperatura;
    }

    @Override
    //Todo
    public boolean esDeHoy(List<Map<String, Object>> clima) {
        return true;
    }


}
```
