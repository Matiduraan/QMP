package qmp;

import javafx.application.Application;
import javafx.stage.Stage;

public class main extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    tipoPrenda unTipo = new tipoPrenda("Camisa",categoriaPrenda.PARTE_SUPERIOR);
    prenda unaPrenda = new prenda("Azul",null,"Lino",unTipo);
    System.out.println(unaPrenda.categoria());
  }
}
