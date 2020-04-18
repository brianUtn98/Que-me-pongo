# Que-me-pongo
<h2>Solución: </h2>
<h3>Requerimientos: </h3>
<ul>
<li>Poder cargar  prendas válidas para generar atuendos con ellas.</li>
<li>Especificar qué tipo de prenda se está cargando.</li>
<li>Identificar la categoría a la que pertenece una prenda.</li>
<li>Identificar el material de una prenda.</li>
<li>Indicar color principal de una prenda.</li>
<li>Indicar en caso de existir, el color secundario de una prenda.</li>	
<li>Evitar que haya prendas sin tipo, material, categoría o color primario.</li>
<li>Evitar que una prenda se contradiga con su tipo.</li>
</ul>
<br>
<h3>Diagrama de clases:<h3>
<IMG src="diagDeClases.jpeg">
  
 <br>
<h3> Codigo: </h3>

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
