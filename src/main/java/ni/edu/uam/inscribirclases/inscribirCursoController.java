package ni.edu.uam.inscribirclases;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class inscribirCursoController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
