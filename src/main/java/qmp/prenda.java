package qmp;

import static java.util.Objects.requireNonNull;

public class prenda {
  String colorPrimario;
  String colorSecundario;
  String material;
  tipoPrenda tipo;

  prenda(String colorPrimario, String colorSecundario, String material, tipoPrenda tipo){
    this.colorPrimario = requireNonNull(colorPrimario, "Debe haber un color primario");
    this.colorSecundario = colorSecundario;
    this.material = requireNonNull(material,"Debe tener un material");
    this.tipo = requireNonNull(tipo,"Debe tener un tipo");
  }

  public String categoria(){
    return tipo.categoria();
  }

  public boolean tieneColorSecundario(){
    return colorSecundario != null;
  }
}
