package qmp;

import java.util.List;
import java.util.Set;

public class Recomendador {
  public List<Prenda> guardarropas;
  public String ciudad;
  public ServicioDelClima servicioUtilizado;

  public Recomendador(List<Prenda> guardarropas, String ciudad, ServicioDelClima servicioDelClima) {
    this.guardarropas = guardarropas;
    this.ciudad = ciudad;
    this.servicioUtilizado = servicioDelClima;
  }

  public Atuendo recomendar(){
    Atuendo atuendoRecomendado = new Atuendo();
    Prenda parteSuperior = guardarropas.stream()
        .filter(Prenda -> Prenda.getTemperaturaMaxima() < (Integer) servicioUtilizado.temperaturaActual().get("Value"))
        .filter(Prenda-> Prenda.categoria() == CategoriaPrenda.PARTE_SUPERIOR)
        .findAny().get();
    atuendoRecomendado.agregarPrenda(parteSuperior);
    Prenda parteInferior = guardarropas.stream()
        .filter(Prenda -> Prenda.getTemperaturaMaxima() < (Integer) servicioUtilizado.temperaturaActual().get("Value"))
        .filter(Prenda-> Prenda.categoria() == CategoriaPrenda.PARTE_INFERIOR)
        .findAny().get();
    atuendoRecomendado.agregarPrenda(parteInferior);
    Prenda calzado = guardarropas.stream()
        .filter(Prenda -> Prenda.getTemperaturaMaxima() < (Integer) servicioUtilizado.temperaturaActual().get("Value"))
        .filter(Prenda-> Prenda.categoria() == CategoriaPrenda.CALZADO)
        .findAny().get();
    atuendoRecomendado.agregarPrenda(calzado);
    Prenda accesorio = guardarropas.stream()
        .filter(Prenda -> Prenda.getTemperaturaMaxima() < (Integer) servicioUtilizado.temperaturaActual().get("Value"))
        .filter(Prenda-> Prenda.categoria() == CategoriaPrenda.ACCESORIO)
        .findAny().get();
    atuendoRecomendado.agregarPrenda(accesorio);
    return atuendoRecomendado;
  }
}
