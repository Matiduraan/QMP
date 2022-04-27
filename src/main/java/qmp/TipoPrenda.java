package qmp;

public class TipoPrenda {
  CategoriaPrenda categoria;

  public CategoriaPrenda categoria(){
    return categoria;
  }

  TipoPrenda(CategoriaPrenda categoria){
    this.categoria = categoria;
  }

  public static final TipoPrenda REMERA = new TipoPrenda(CategoriaPrenda.PARTE_SUPERIOR);
  public static final TipoPrenda CHOMBA = new TipoPrenda(CategoriaPrenda.PARTE_SUPERIOR);
  public static final TipoPrenda CAMISA = new TipoPrenda(CategoriaPrenda.PARTE_SUPERIOR);
  public static final TipoPrenda JEAN = new TipoPrenda(CategoriaPrenda.PARTE_INFERIOR);
  public static final TipoPrenda PANTALON = new TipoPrenda(CategoriaPrenda.PARTE_INFERIOR);
  public static final TipoPrenda PANTALON_DE_VESTIR = new TipoPrenda(CategoriaPrenda.PARTE_INFERIOR);
  public static final TipoPrenda SANDALIA = new TipoPrenda(CategoriaPrenda.CALZADO);
  public static final TipoPrenda ZAPATILLAS = new TipoPrenda(CategoriaPrenda.CALZADO);
  public static final TipoPrenda ZAPATO = new TipoPrenda(CategoriaPrenda.CALZADO);
  public static final TipoPrenda RELOJ = new TipoPrenda(CategoriaPrenda.ACCESORIO);
  public static final TipoPrenda PULSERA = new TipoPrenda(CategoriaPrenda.ACCESORIO);
  public static final TipoPrenda ANTEOJOS = new TipoPrenda(CategoriaPrenda.ACCESORIO);



}

