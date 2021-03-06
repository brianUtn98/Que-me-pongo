package main;

public class SastreJohnston implements Sastre {
    @Override
    public Prenda fabricarParteSuperior() {
    TipoDePrenda CAMISA = new TipoDePrenda(Categoria.PARTE_SUPERIOR,25,0);
    Borrador camisaBlanca =new Borrador(CAMISA);
    camisaBlanca.especificarColorPrincipal(new Color(255,255,255));
    camisaBlanca.especificarMaterial(Material.ALGODON);
    camisaBlanca.especificarTrama(Trama.LISA);
    return camisaBlanca.crearPrenda();
    }

    @Override
    public Prenda fabricarParteInferior() {
    TipoDePrenda PANTALON = new TipoDePrenda(Categoria.PARTE_INFERIOR,30,0);
    Borrador pantalonDeVestir = new Borrador(PANTALON);
    pantalonDeVestir.especificarColorPrincipal(new Color(0,0,0));
    pantalonDeVestir.especificarMaterial(Material.ALGODON);
    pantalonDeVestir.especificarTrama(Trama.LISA);
    return pantalonDeVestir.crearPrenda();
    }

    @Override
    public Prenda fabricarCalzada() {
    TipoDePrenda ZAPATOS = new TipoDePrenda(Categoria.CALZADO,50,0);
    Borrador zapatosNegros = new Borrador(ZAPATOS);
    zapatosNegros.especificarColorPrincipal(new Color(0,0,0));
    zapatosNegros.especificarMaterial(Material.CUERO);
    return zapatosNegros.crearPrenda();
    }
}
