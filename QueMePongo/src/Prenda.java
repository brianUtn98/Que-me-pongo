public class Prenda{
    TipoPrenda tipo;
    CategoriaPrenda categoria;
    MaterialPrenda material;
    Color colorPrincipal;
    Color colorSecundario;

    public Prenda(TipoPrenda tipo,CategoriaPrenda categoria, MaterialPrenda material,Color colorPrincipal,Color colorSecundario)
    {
        this.tipo = tipo;
        this.categoria=categoria;
        this.material=material;
        this.colorPrincipal=colorPrincipal;
        this.colorSecundario=colorSecundario;

        if(tipo == null){
            throw new PrendaInvalidaExcepcion("Una prenda debe tener tipo");
        }
        if(categoria == null){
            throw  new PrendaInvalidaExcepcion("Una prenda debe tener categoria");
        }
        if(material == null){
            throw new PrendaInvalidaExcepcion("Una prenda debe tener material");
        }
        if(colorPrincipal == null){
            throw new PrendaInvalidaExcepcion("Una prenda tiene que tener color principal");
        }


    }


}

