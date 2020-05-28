import java.awt.*;

public class Prenda {
    private TipoDePrenda tipo;
    private Color colorPrincipal;
    private Color colorSecundario;
    private Material material;
    private Trama trama;
    private int temperaturaMaxima;
    private int temperaturaMinima;

    public Prenda(TipoDePrenda tipo, Color colorPrincipal, Color colorSecundario, Material material, Trama trama) {
       if(tipo==null){
           throw new PrendaInvalidaException("Una prenda tiene que tener TIPO");
       }
        this.tipo = tipo;
        if(colorPrincipal==null){
            throw new PrendaInvalidaException("Una prenda tiene que tener COLOR PRINCIPAL");
        }
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
        if(material==null){
            throw new PrendaInvalidaException("Una prenda tiene que tener MATERIAL");
        }
        this.material = material;
        if (trama == null) {
            trama=Trama.LISA;
        }
        else
        {
            this.trama = trama;
        }
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public int getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public Categoria categoria(){
    return this.tipo.categoria();
    }
}
