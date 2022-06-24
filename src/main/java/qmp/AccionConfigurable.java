package qmp;

import java.util.List;

public interface AccionConfigurable {
  public void notificar(List<AlertaMeteorologica> alertasMeteorologicas,Usuario usuario);
}
