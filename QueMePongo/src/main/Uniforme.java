package main;

public class Uniforme {
    private Prenda prendaSuperior;
    private Prenda prendaInferior;
    private Prenda calzado;

    public Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
        if(prendaSuperior==null){
            throw new UniformeInvalidoException("Un uniforme requiere una PRENDA SUPERIOR");
        }
        if(prendaInferior==null){
            throw new UniformeInvalidoException("Un uniforme requiere una PRENDA INFERIOR");
        }
        if(calzado==null){
            throw new UniformeInvalidoException("Un uniforme requiere un calzado");
        }

        this.prendaSuperior = prendaSuperior;
        this.prendaInferior = prendaInferior;
        this.calzado = calzado;
    }

    static Uniforme fabricar(Sastre sastre){
    Uniforme uniforme=new Uniforme(sastre.fabricarCalzada(),sastre.fabricarParteInferior(),sastre.fabricarParteSuperior());
    return uniforme;
    }
}
