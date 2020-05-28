package main;

public class PrendaInvalidaException extends RuntimeException {
    public PrendaInvalidaException(String razon){
        super(razon);
    }
}
