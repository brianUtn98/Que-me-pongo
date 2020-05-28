package main;

import java.util.List;

public class Atuendo {
    Prenda parteSuperior;
    Prenda parteInferior;
    Prenda calzado;
List<Prenda> accesorios;

    public Atuendo(Prenda parteSuperior, Prenda parteInferior, Prenda calzado, List<Prenda> accesorios) {
        if(parteSuperior.categoria()!=Categoria.PARTE_SUPERIOR){
            throw new PrendaInvalidaException("No es una parte superior");
        }
        if(parteInferior.categoria()!=Categoria.PARTE_INFERIOR){
            throw new PrendaInvalidaException("No es una parte inferior");
        }
        if(calzado.categoria()!=Categoria.CALZADO){
            throw new PrendaInvalidaException("No es un calzado");
        }

        if(accesorios.stream().anyMatch(unAccesorio -> this.noEsAccesorio(unAccesorio))){
            throw new PrendaInvalidaException("Uno de los accesorios no corresponde");
        }
        this.parteSuperior = parteSuperior;
        this.parteInferior = parteInferior;
        this.calzado = calzado;
        this.accesorios = accesorios;
    }

    private boolean noEsAccesorio(Prenda accesorio){
        return (accesorio.categoria()!=Categoria.ACCESORIOS);
    }

    public boolean atuendoAptoTemperatura(int temperatura){
        if(this.calzado.getTemperaturaMaxima()>temperatura || this.calzado.getTemperaturaMinima()<temperatura){
            return false;
        }
        if(this.parteInferior.getTemperaturaMaxima()>temperatura || this.parteInferior.getTemperaturaMinima()<temperatura){
            return false;
        }
        if(this.parteSuperior.getTemperaturaMaxima()>temperatura || this.parteSuperior.getTemperaturaMinima()<temperatura){
            return false;
        }

        return true;
    }
}
