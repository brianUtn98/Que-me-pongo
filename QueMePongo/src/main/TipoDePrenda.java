package main;

public class TipoDePrenda {
    private Categoria categoria;
    private int temperaturaMaxima;
    private int temperaturaMinima;
    public TipoDePrenda(Categoria categoria,int temperaturaMaxima,int temperaturaMinima) {
        this.categoria = categoria;
        this.temperaturaMaxima=temperaturaMaxima;
        this.temperaturaMinima=temperaturaMinima;
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public int getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public Categoria categoria(){
    return this.categoria;
    }
}
