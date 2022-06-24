package qmp;
import java.util.ArrayList;
import java.util.List;

public class Usuarios {

  private List<Usuario> usuarios;
  private static final Usuarios instance = new Usuarios();

  private Usuarios() {
    this.usuarios = new ArrayList<Usuario>();
  }

  public static Usuarios getInstance() {
    return instance;
  }

  public void agregarUsuario(Usuario nuevoUsuario){
    this.usuarios.add(nuevoUsuario);
  }

  public List<Usuario> getUsuarios(){
    return this.usuarios;
  }

  public void sugerirAtuendos(String ciudad,ServicioDelClima servicioDelClima ){
    this.usuarios.stream().forEach(usuario -> usuario.sugerirAtuendo(ciudad,servicioDelClima));
  }

  public void notificarAlertas(List<AlertaMeteorologica> alertasMeteorologicas){
    this.usuarios.forEach(usuario -> usuario.notificarAlertas(alertasMeteorologicas));
  }
}