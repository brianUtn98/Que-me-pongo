import java.util.ArrayList;
import java.util.List;

public class Usuario {
List<Prenda> Guardarropas = new ArrayList<Prenda>();


    public void agregarPrenda(Prenda prenda){
        this.Guardarropas.add(prenda);
    }

}
