package qmp;

public class tipoPrenda {
  String nombre;
  categoriaPrenda categoria;

  public String categoria(){
    return categoria.name();
  }

  tipoPrenda(String nombre, categoriaPrenda categoria){
    this.nombre = nombre;
    this.categoria = categoria;
  }
}
