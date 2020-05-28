import java.util.ArrayList;
import java.util.List;

public class Usuario {
    Ciudad ciudad;
List<Prenda> Guardarropas = new ArrayList<Prenda>();


    public void agregarPrenda(Prenda prenda){
        this.Guardarropas.add(prenda);
    }
    public void generarPrenda(TipoDePrenda tipo,Color colorPrincipal,Color colorSecundario,Material material,Trama trama){
        Borrador nuevaPrenda = new Borrador(tipo);
        nuevaPrenda.especificarColorPrincipal(colorPrincipal);
        nuevaPrenda.especificarColorSecundario(colorSecundario);
        nuevaPrenda.especificarMaterial(material);
        nuevaPrenda.especificarTrama(trama);
        this.agregarPrenda(nuevaPrenda.crearPrenda());
    }


}
