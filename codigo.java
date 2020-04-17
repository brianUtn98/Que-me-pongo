Public class Atuendo {
    List prendas = nueva Lista<Prenda>;

    Public agregarPrendas(Prenda unaPrenda){
        int error=0;
    if(unaPrenda.getTipo().getCategoria() != unaPrenda.getCategoria()){
        lanzar_nueva_excepcion = "El tipo de prenda no es compatible con la categoria";
        error=1;
    }

    if(algunCampoEstaVacio(unaPrenda))
    {
        lanzar_nueva_excepcion = "La prenda tiene informacion incompleta";
        error=1;
    }
        if(!error) {

        prendas.add(unaPrenda);
        }

    }
}

Public enum tipoPrenda {
    zapato{
        public Categoria getCategoria(){
            return Categoria.calzado;
        }
    },
    camisa{
        public Categoria getCategoria(){
            return Categoria.parteSuperior;
        }
    },
    camisetaMangaLarga{
        public Categoria getCategoria(){
            return Categoria.parteSuperior;
        }
    },
    pollera{
        public Categoria getCategoria(){
            return Categoria.parteInferior;
        }
    },
    pantalon{
        public Categoria getCategoria(){
            return Categoria.calzado;
        }
        public abstract Categoria getCategoria();
    }
}

public enum Categoria {
    calzado,parteSuperior,parteInferior,accesorios
};

public class Prenda{
    Tipo tipo;
    Categoria categoria;
    Material material;
    Color colorPrincipal;
    Color colorSecundario;

    //Getters

}

public class Color{
    //¿Podría ser un enum? No quise abusar de los enums.
}


