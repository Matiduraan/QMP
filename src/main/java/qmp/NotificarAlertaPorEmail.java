package qmp;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class NotificarAlertaPorEmail implements AccionConfigurable {
  private MailSender mailSender;

  @Override
  public void notificar(List<AlertaMeteorologica> alertasMeteorologicas,Usuario usuario) {
    String email = "Nuevas alertas: " + alertasMeteorologicas.stream().map(Objects::toString).collect(Collectors.joining(", "));
    mailSender.send(usuario.getEmail(),email);
  }
}
