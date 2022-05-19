package qmp;

import static java.util.Objects.requireNonNull;
import static qmp.TipoPrenda.*;

public class Prenda {
  Color colorPrimario;
  Color colorSecundario;
  Material material;
  Trama trama;
  TipoPrenda tipo;
  Integer temperaturaMaxima;

  Prenda(TipoPrenda tipo, Color colorPrimario, Color colorSecundario, Material material, Trama trama, Integer temperaturaMaxima){
    this.tipo = tipo;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.material = material;
    this.trama = trama;
    this.temperaturaMaxima = temperaturaMaxima;
  }

  public Integer getTemperaturaMaxima(){
    return this.temperaturaMaxima;
  }

  public CategoriaPrenda categoria(){
    return tipo.categoria();
  }
}
