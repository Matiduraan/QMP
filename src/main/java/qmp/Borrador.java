package qmp;

public class Borrador {
  Color colorPrimario;
  Color colorSecundario;
  Material material;
  Trama trama;
  TipoPrenda tipo;

  Borrador(TipoPrenda tipo){
    this.tipo = tipo;
  }

  public void agregarCaracteristicas(Color colorPrimario,Material material, Trama trama){
    this.colorPrimario = colorPrimario;
    this.material = material;
    this.trama = trama;
  }

  public void agregarColorSecundario(Color colorSecundario){
    this.colorSecundario = colorSecundario;
  }

  public Prenda guardarPrenda(){
    Prenda prendaADevolver = new Prenda(tipo,colorPrimario,colorSecundario,material,trama);
    return prendaADevolver;
  }
}