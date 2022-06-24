package qmp;

import java.util.List;

public class cambioAtuendoPorAlerta implements AccionConfigurable {
  ServicioDelClima servicioDelClima;
  String ciudad;
  @Override
  public void notificar(List<AlertaMeteorologica> alertasMeteorologicas,Usuario usuario) {
    usuario.sugerirAtuendo(ciudad,servicioDelClima);
  }
}
