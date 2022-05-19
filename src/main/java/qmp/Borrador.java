package qmp;

import static java.util.Objects.requireNonNull;

public class Borrador {
  Color colorPrimario;
  Color colorSecundario;
  Material material;
  Trama trama;
  TipoPrenda tipo;
  Integer temperaturaMaxima;

  Borrador(TipoPrenda tipo){
    this.tipo = requireNonNull(tipo,"Debe tener un tipo");
  }

  public void agregarCaracteristicas(Color colorPrimario,Material material, Trama trama){
    this.colorPrimario = requireNonNull(colorPrimario, "Debe tener un color primario");
    this.material = requireNonNull(material,"Debe tener un material");
    this.trama = trama != null ? trama : Trama.LISA;
  }

  public void setearColorPrimario(Color colorPrimario){
    this.colorPrimario = requireNonNull(colorPrimario, "Debe tener un color primario");
  }

  public void setearMaterial(Material material){
    this.material = requireNonNull(material,"Debe tener un material");
  }

  public void setearTrama(Trama trama){
    this.trama = trama != null ? trama : Trama.LISA;
  }

  public void agregarColorSecundario(Color colorSecundario){
    this.colorSecundario = colorSecundario;
  }

  public void setTemperaturaMaxima(Integer temperaturaMaxima) {
    this.temperaturaMaxima = temperaturaMaxima;
  }

  public Prenda guardarPrenda(){
    return new Prenda(tipo,colorPrimario,colorSecundario,material,trama,temperaturaMaxima);
  }
}