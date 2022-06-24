package qmp;

import java.util.HashMap;
import java.util.List;

public interface ServicioDelClima {
  public HashMap<String, Object> temperaturaActual();

  public List<AlertaMeteorologica> getAlertasActuales(String ciudad);
}
