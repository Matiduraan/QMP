package qmp;

import java.util.List;

public class AlertaGranizo implements AccionConfigurable {
  NotificationService notificationService;
  @Override
  public void notificar(List<AlertaMeteorologica> alertasMeteorologicas,Usuario usuario){
    if (alertasMeteorologicas.contains(AlertaMeteorologica.GRANIZO)){
      notificationService.notify("No salir con el auto");
    }
  }
}
