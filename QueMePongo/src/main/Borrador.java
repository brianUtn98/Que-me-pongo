package main;

public class Borrador {
    private TipoDePrenda tipo;
    private Material material;
    private Color colorPrincipal;
    private Color colorSecundario;
    private Trama trama;

    public Borrador(TipoDePrenda tipo) {
        this.tipo = tipo;
    }

    public void especificarMaterial(Material material){
    this.material=material;
    }

    public void especificarColorPrincipal(Color color){
    this.colorPrincipal=color;
    }

    public void especificarColorSecundario(Color color){
    this.colorSecundario=color;
    }

    public void especificarTrama(Trama trama){
    this.trama=trama;
    }

    public Prenda crearPrenda(){
    Prenda nuevaPrenda=new Prenda(this.tipo,this.colorPrincipal,this.colorSecundario,this.material,this.trama);
        return nuevaPrenda;
    }

}
