package it.unisa.diem.softeng.gruppo4;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @brief Applicazione JavaFX per la prenotazione delle aule.
 *
 * Crea la finestra principale e vi carica la vista definita nel file
 * MainView.fxml.
 */
public class App extends Application {

    /**
     * @brief Titolo mostrato nella barra della finestra principale.
     */
    public static final String TITOLO = "Prenotazione Aule";

    /**
     * @brief Larghezza iniziale della finestra principale, in pixel.
     */
    public static final double LARGHEZZA = 1000;

    /**
     * @brief Altezza iniziale della finestra principale, in pixel.
     */
    public static final double ALTEZZA = 650;

    // la vista sta in src/main/resources, nello stesso package di questa classe
    private static final String VISTA_PRINCIPALE = "MainView.fxml";

    /**
     * @brief Crea e mostra la finestra principale.
     * @param[in] stage La finestra fornita da JavaFX all'avvio.
     * @throws IOException Se il file della vista principale non può essere letto.
     * @post La finestra principale è visibile, con titolo `TITOLO` e
     *       dimensioni `LARGHEZZA` x `ALTEZZA`.
     */
    @Override
    public void start(Stage stage) throws IOException {
        Parent radice = FXMLLoader.load(getClass().getResource(VISTA_PRINCIPALE));
        stage.setScene(new Scene(radice, LARGHEZZA, ALTEZZA));
        stage.setTitle(TITOLO);
        stage.show();
    }

    /**
     * @brief Avvia l'applicazione JavaFX.
     * @param[in] args Argomenti da riga di comando (non utilizzati).
     */
    public static void main(String[] args) {
        launch(args);
    }
}
