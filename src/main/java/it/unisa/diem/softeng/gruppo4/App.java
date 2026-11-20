package it.unisa.diem.softeng.gruppo4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    public static final String TITOLO = "Prenotazione Aule";
    public static final double LARGHEZZA = 1000;
    public static final double ALTEZZA = 650;

    @Override
    public void start(Stage stage) {
        // finestra provvisoria, verrà sostituita dalla vista principale
        StackPane radice = new StackPane(new Label(TITOLO));
        stage.setScene(new Scene(radice, LARGHEZZA, ALTEZZA));
        stage.setTitle(TITOLO);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
