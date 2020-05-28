public class SastreSanJuan implements Sastre {


    @Override

    public Prenda fabricarParteSuperior() {
    TipoDePrenda CHOMBA = new TipoDePrenda(Categoria.PARTE_SUPERIOR,30,10);
    Borrador chombaVerde = new Borrador(CHOMBA);
    chombaVerde.especificarColorPrincipal(new Color(0,255,0));
    chombaVerde.especificarMaterial(Material.PIQUE);
    return chombaVerde.crearPrenda();
    }

    @Override
    public Prenda fabricarParteInferior() {
    TipoDePrenda PANTALON = new TipoDePrenda(Categoria.PARTE_INFERIOR,30,0);
    Borrador pantalonGris = new Borrador(PANTALON);
    pantalonGris.especificarColorPrincipal(new Color(130,130,130));
    pantalonGris.especificarMaterial(Material.ACETATO);
    return pantalonGris.crearPrenda();
    }

    @Override
    public Prenda fabricarCalzada() {
    TipoDePrenda ZAPATILLAS = new TipoDePrenda(Categoria.CALZADO,50,0);
    Borrador zapatillasBlancas = new Borrador(ZAPATILLAS);
    zapatillasBlancas.especificarColorPrincipal(new Color(255,255,255));
    zapatillasBlancas.especificarMaterial(Material.GAMUSA);
    return zapatillasBlancas.crearPrenda();
    }
}
