package qmp;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class climaAccuWeather implements ServicioDelClima {
  private AccuWeatherAPI accuWeatherAPI;
  private List<Map<String, Object>> climaActual;
  private LocalDate fechaDeVencimiento;
  private String ciudad;

  public climaAccuWeather(AccuWeatherAPI accuWeatherAPI, LocalDate fechaDeVencimiento, String ciudad) {
    this.accuWeatherAPI = accuWeatherAPI;
    this.fechaDeVencimiento = fechaDeVencimiento;
    this.ciudad = ciudad;
  }

  public List<Map<String, Object>> getClimaActual() {
    if (climaActual == null || this.climaVencido()){
      this.climaActual = accuWeatherAPI.getWeather(this.ciudad);
      this.fechaDeVencimiento = LocalDate.now().plus(24, ChronoUnit.HOURS);
    }
      return climaActual;
  }

  @Override
  public HashMap<String, Object> temperaturaActual() {
    return (HashMap<String, Object>) this.getClimaActual().get(0).get("Temperature");
  }

  private boolean climaVencido(){
    return LocalDate.now().isAfter(fechaDeVencimiento);
  }

  @Override
  public List<AlertaMeteorologica> getAlertasActuales(String ciudad) {
    List<String> alertas = (List<String>)accuWeatherAPI.getAlertas(ciudad).get("CurrentAlerts");
    return alertas.stream().map(alerta -> AlertaMeteorologica.valueOf(alerta)).collect(Collectors.toList());
  }

}
