package qmp;

import java.util.List;

public class AlertaTormenta implements AccionConfigurable {
  NotificationService notificationService;

  @Override
  public void notificar(List<AlertaMeteorologica> alertasMeteorologicas,Usuario usuario) {
    if (alertasMeteorologicas.contains(AlertaMeteorologica.TORMENTA)){
      notificationService.notify("Recuerde llevar paraguas");
    }

  }
}
