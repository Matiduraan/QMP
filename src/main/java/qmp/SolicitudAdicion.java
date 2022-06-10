package qmp;

public class SolicitudAdicion implements Solicitud{
  Prenda prendaAAgregar;

  SolicitudAdicion(Prenda prendaAAgregar){
    this.prendaAAgregar = prendaAAgregar;
  }

  @Override
  public void aceptarEn(Guardarropas guardarropas) {
    guardarropas.agregarPrenda(prendaAAgregar);
  }

  @Override
  public void deshacerEn(Guardarropas guardarropas) {
    guardarropas.quitarPrenda(prendaAAgregar);
  }
}
