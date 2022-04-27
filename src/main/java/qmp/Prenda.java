package qmp;

import static java.util.Objects.requireNonNull;
import static qmp.TipoPrenda.*;

public class Prenda {
  Color colorPrimario;
  Color colorSecundario;
  Material material;
  Trama trama;
  TipoPrenda tipo;

  Prenda(TipoPrenda tipo, Color colorPrimario, Color colorSecundario, Material material, Trama trama){
    this.tipo = requireNonNull(tipo,"Debe tener un tipo");
    this.colorPrimario = requireNonNull(colorPrimario, "Debe tener un color primario");
    this.colorSecundario = colorSecundario;
    this.material = requireNonNull(material,"Debe tener un material");
    this.trama = trama != null ? trama : Trama.LISA;
  }

  public CategoriaPrenda categoria(){
    return tipo.categoria();
  }

  public static final Prenda chombaPique = new Prenda(CHOMBA,new Color(0,255,0),null,Material.PIQUE,null);
  public static final Prenda pantalonAcetatoGris = new Prenda(PANTALON,new Color(132,132,132),null,Material.ACETATO,null);
  public static final Prenda zapatillasBlancas = new Prenda(ZAPATILLAS,new Color(255,255,255),null,Material.CUERO,null);
  public static final Prenda camisaBlanca = new Prenda(CAMISA,new Color(255,255,255),null,Material.ALGODON,null);
  public static final Prenda pantalonDeVestirNegro = new Prenda(PANTALON_DE_VESTIR,new Color(0,0,0),null,Material.LINO,null);
  public static final Prenda zapatosNegros = new Prenda(ZAPATO,new Color(0,0,0),null,Material.CHAROL,null);
}
