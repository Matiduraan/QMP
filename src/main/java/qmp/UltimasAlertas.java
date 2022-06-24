package qmp;

import java.util.ArrayList;
import java.util.List;

public class UltimasAlertas {
  climaAccuWeather climaAccuWeather;
  List<AlertaMeteorologica> alertasActuales = new ArrayList<>();

  public void actualizarAlertas(String ciudad){
    this.alertasActuales = climaAccuWeather.getAlertasActuales(ciudad);
  }
}
