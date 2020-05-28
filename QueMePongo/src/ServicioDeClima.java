import java.util.List;
import java.util.Map;

public interface ServicioDeClima {
    public List<Map<String, Object>> obtenerClima(String ciudad);
}
