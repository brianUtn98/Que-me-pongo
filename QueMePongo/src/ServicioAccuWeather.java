import java.util.List;
import java.util.Map;

public class ServicioAccuWeather implements ServicioDeClima{
    AccuWeatherAPI servicioClima;
    @Override
    public List<Map<String, Object>> obtenerClima(String ciudad) {
        return servicioClima.getWeather(ciudad);
    }
    //Todo
    //No se como manejar el esto, así que meto un hardcodeado loco
    //No, este no es el mock (pero falta aclarar esa duda).
    public int obtenerTemperatura(String ciudad) {
        int temperatura=57;
        return convertirUnidades(temperatura,"F");
    }

    public int convertirUnidades(int temperatura,String unidad){
        if(unidad=="F"){
            return (temperatura-32)*(5/9);
        }
        return temperatura;
    }
}
