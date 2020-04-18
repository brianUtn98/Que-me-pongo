public enum TipoPrenda {
    zapatos{
        public CategoriaPrenda getCategoria(){
            return CategoriaPrenda.calzado;
        }

    }, camisaMangasCortas{
        public CategoriaPrenda getCategoria(){
            return CategoriaPrenda.parteSuperior;
        }
    },
    pantalon{
        public CategoriaPrenda getCategoria(){
            return CategoriaPrenda.parteInferior;
        }
    },
    camisaMangasLargas{
        public CategoriaPrenda getCategoria(){
            return CategoriaPrenda.parteSuperior;
        }

    };

    public abstract CategoriaPrenda getCategoria();
}
