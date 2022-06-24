package qmp;

import java.util.List;

public class Recomendador {
  public Guardarropas guardarropas;
  public String ciudad;
  public ServicioDelClima servicioUtilizado;

  public Recomendador(Guardarropas guardarropas, String ciudad, ServicioDelClima servicioDelClima) {
    this.guardarropas = guardarropas;
    this.ciudad = ciudad;
    this.servicioUtilizado = servicioDelClima;
  }

  public Atuendo recomendar(){
    Atuendo atuendoRecomendado = new Atuendo();
    Prenda parteSuperior = guardarropas.getPrendas().stream()
        .filter(Prenda -> Prenda.getTemperaturaMaxima() < (Integer) servicioUtilizado.temperaturaActual().get("Value"))
        .filter(Prenda-> Prenda.categoria() == CategoriaPrenda.PARTE_SUPERIOR)
        .findAny().get();
    atuendoRecomendado.agregarPrenda(parteSuperior);
    Prenda parteInferior = guardarropas.getPrendas().stream()
        .filter(Prenda -> Prenda.getTemperaturaMaxima() < (Integer) servicioUtilizado.temperaturaActual().get("Value"))
        .filter(Prenda-> Prenda.categoria() == CategoriaPrenda.PARTE_INFERIOR)
        .findAny().get();
    atuendoRecomendado.agregarPrenda(parteInferior);
    Prenda calzado = guardarropas.getPrendas().stream()
        .filter(Prenda -> Prenda.getTemperaturaMaxima() < (Integer) servicioUtilizado.temperaturaActual().get("Value"))
        .filter(Prenda-> Prenda.categoria() == CategoriaPrenda.CALZADO)
        .findAny().get();
    atuendoRecomendado.agregarPrenda(calzado);
    Prenda accesorio = guardarropas.getPrendas().stream()
        .filter(Prenda -> Prenda.getTemperaturaMaxima() < (Integer) servicioUtilizado.temperaturaActual().get("Value"))
        .filter(Prenda-> Prenda.categoria() == CategoriaPrenda.ACCESORIO)
        .findAny().get();
    atuendoRecomendado.agregarPrenda(accesorio);
    return atuendoRecomendado;
  }
}
