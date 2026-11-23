package it.unisa.diem.softeng.gruppo4;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static final String TITOLO = "Prenotazione Aule";
    public static final double LARGHEZZA = 1000;
    public static final double ALTEZZA = 650;

    // la vista sta in src/main/resources, nello stesso package di questa classe
    private static final String VISTA_PRINCIPALE = "MainView.fxml";

    @Override
    public void start(Stage stage) throws IOException {
        Parent radice = FXMLLoader.load(getClass().getResource(VISTA_PRINCIPALE));
        stage.setScene(new Scene(radice, LARGHEZZA, ALTEZZA));
        stage.setTitle(TITOLO);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
