package qmp;

public class Usuario {
  String nombreCompleto;

  Usuario(String nombreCompleto){
    this.nombreCompleto = nombreCompleto;
  }

  public void recomendarAgregarPrendaA(Usuario usuario,Guardarropas guardarropas,Prenda prendaARecomendar){
    if (guardarropas.usuarioPertenece(usuario)){
      guardarropas.generarSolicitud(new SolicitudAdicion(prendaARecomendar));
    }else {
      throw new RuntimeException("El usuario ingresado no posee ese guardarropas");
    }
  }

  public void recomendarBorrarPrendaA(Usuario usuario,Guardarropas guardarropas,Prenda prendaARecomendar){
    if (guardarropas.usuarioPertenece(usuario)){
      guardarropas.generarSolicitud(new SolicitudSustraccion(prendaARecomendar));
    }else {
      throw new RuntimeException("El usuario ingresado no posee ese guardarropas");
    }
  }
}
