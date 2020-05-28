package main;

import java.util.List;
import java.util.Map;

public interface ServicioDeClima {
    public List<Map<String, Object>> obtenerClima(String ciudad);
    public int obtenerTemperatura(String ciudad);
    public int convertirUnidades(int temperatura,String unidad);
    public boolean esDeHoy(List<Map<String, Object>> clima);

}
