import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Todo
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
