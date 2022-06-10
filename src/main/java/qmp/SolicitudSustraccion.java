package qmp;

import java.util.List;

public class SolicitudSustraccion implements Solicitud{
  Prenda prendaARemover;

  public SolicitudSustraccion(Prenda prendaARemover) {
    this.prendaARemover = prendaARemover;
  }

  @Override
  public void aceptarEn(Guardarropas guardarropas) {
    guardarropas.quitarPrenda(prendaARemover);
  }

  @Override
  public void deshacerEn(Guardarropas guardarropas) {
    guardarropas.agregarPrenda(prendaARemover);
  }
}
