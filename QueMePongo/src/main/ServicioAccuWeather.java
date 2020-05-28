package main;

import java.util.List;
import java.util.Map;

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
