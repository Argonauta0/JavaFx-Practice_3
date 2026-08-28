package ni.edu.uam.inscribirclases;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class InscribirCursoApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(InscribirCursoApplication.class.getResource("inscribirCurso.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 680, 700);
        stage.setScene(scene);
        stage.show();
    }
}
