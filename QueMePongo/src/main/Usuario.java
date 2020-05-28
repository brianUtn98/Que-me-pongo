import java.security.Guard;
import java.util.ArrayList;
import java.util.List;

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
