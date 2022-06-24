package qmp;

import java.util.List;

public class Uniforme {
  public Prenda parteSuperior;
  public Prenda parteInferior;
  public Prenda calzado;

  Uniforme(Prenda parteSuperior, Prenda parteInferior, Prenda calzado){
    this.parteSuperior = parteSuperior;
    this.parteInferior = parteInferior;
    this.calzado = calzado;
  }

  public Uniforme sugerirUniforme(List<Prenda> prendasDisponibles) throws Exception {
    Prenda parteSuperior = prendasDisponibles.stream().filter(prenda -> prenda.categoria() == CategoriaPrenda.PARTE_SUPERIOR).findAny().orElseThrow(()-> new Exception("No hay partes superiores disponibles"));
    Prenda parteInferior = prendasDisponibles.stream().filter(prenda -> prenda.categoria() == CategoriaPrenda.PARTE_INFERIOR).findAny().orElseThrow(()-> new Exception("No hay partes superiores inferiores"));
    Prenda calzado = prendasDisponibles.stream().filter(prenda -> prenda.categoria() == CategoriaPrenda.CALZADO).findAny().orElseThrow(()-> new Exception("No hay calzados disponibles"));
    return new Uniforme(parteSuperior,parteInferior,calzado);
  }
}
