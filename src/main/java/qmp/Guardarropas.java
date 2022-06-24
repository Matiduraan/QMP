package qmp;

import java.util.List;

public class Guardarropas {
  String criterio;
  List<Prenda> prendas;
  List<Solicitud> solicitudesPendientes;
  List<Solicitud> solicitudesRealizadas;
  List<Usuario> duenos;

  Guardarropas(String criterio,List<Prenda> prendas,List<Usuario> duenos){
    this.prendas = prendas;
    this.criterio = criterio;
    this.duenos = duenos;
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }

  public void agregarNuevoDueno(Usuario nuevoDueno){
    duenos.add(nuevoDueno);
  }

  public void generarSolicitud(Solicitud nuevaSolicitud){
    solicitudesPendientes.add(nuevaSolicitud);
  }

  public void realizarSolicitud(Solicitud solicitudARealizar){
    solicitudARealizar.aceptarEn(this);
    solicitudesPendientes.remove(solicitudARealizar);
    solicitudesRealizadas.add(solicitudARealizar);
  }

  public void rechazarSolicitud(Solicitud solicitudARechazar){
    this.solicitudesPendientes.remove(solicitudARechazar);
  }

  public void agregarPrenda(Prenda prenda) {
    this.prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda){
    this.prendas.remove(prenda);
  }

  public void deshacerSolicitudesDesde(Solicitud solicitudAPartirDeLaCualDeshacer){
    Integer indice = solicitudesRealizadas.indexOf(solicitudAPartirDeLaCualDeshacer);
    if (indice == -1){
      throw new RuntimeException("La solicitud ingresada nunca se realizo");
    }else {
      for (int i = solicitudesRealizadas.size() - 1; i >= indice; i--){
        solicitudesRealizadas.get(i).deshacerEn(this);
      }
    }
  }

  public Boolean usuarioPertenece(Usuario usuarioAConsultar){
    return duenos.contains(usuarioAConsultar);
  }
}
