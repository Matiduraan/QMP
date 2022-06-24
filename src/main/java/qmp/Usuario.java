package qmp;

import java.util.List;

public class Usuario {
  String nombreCompleto;
  String email;
  List<Guardarropas> guardarropas;
  Atuendo sugerenciaDiaria;
  List<AccionConfigurable> accionesConfigurables;

  Usuario(String nombreCompleto,String email,List<Guardarropas> guardarropas,List<AccionConfigurable> accionesConfigurables){
    this.nombreCompleto = nombreCompleto;
    this.email = email;
    this.guardarropas = guardarropas;
    this.accionesConfigurables = accionesConfigurables;
  }

  public String getEmail() {
    return email;
  }

  public void agregarAccionConfigurable(AccionConfigurable accionConfigurable){
    this.accionesConfigurables.add(accionConfigurable);
  }

  public void removerAccionConfigurable(AccionConfigurable accion){
    this.accionesConfigurables.remove(accion);
  }

  public void recomendarAgregarPrendaA(Usuario usuario, Guardarropas guardarropas, Prenda prendaARecomendar){
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

  public void sugerirAtuendo(String ciudad,ServicioDelClima servicioDelClima){
    this.sugerenciaDiaria = new Recomendador(this.guardarropas.stream().findAny().get(),ciudad,servicioDelClima).recomendar();
  }

  public void notificarAlertas(List<AlertaMeteorologica> alertasMeteorologicas){
    this.accionesConfigurables.forEach(accion -> accion.notificar(alertasMeteorologicas,this));
  }
}
