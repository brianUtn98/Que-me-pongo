import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Todo
public class AcuMock implements ServicioDeClima{

    @Override
    public List<Map<String, Object>> obtenerClima(String ciudad) {
        return Arrays.asList(new HashMap<String, Object>(){{
            put("DateTime", "2020-28-05T01:00:00-03:00");
            put("EpochDateTime", 1556061234);
            put("WeatherIcon", 33);
            put("IconPhrase", "Clear");
            put("IsDaylight", true);
            put("PrecipitationProbability", 25);
            put("MobileLink", "https://www.accuweather.com/en/ar/ciudad-evita/7517");
            put("Link", "http://www.accuweather.com/en/ar/ciudad-evita/7517");
            put("Temperature", new HashMap<String, Object>(){{
                put("Value", 57);
                put("Unit", "K");
                put("UnitType", 18);
            }});
        }});
    }

    public int Temperatura(){
        return this.obtenerClima().
    }
}
