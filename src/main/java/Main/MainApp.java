package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Model.Estudiante;

public class MainApp extends Application {
    private static Scene scene;
    private static Estudiante estudianteActual;

    @Override
    public void start(Stage stage) throws Exception {
        scene = new Scene(loadFXML("MainView"), 600, 400);
        stage.setScene(scene);
        stage.setTitle("Sistema de Votación Escolar");
        stage.show();
    }

    public static void setRoot(String fxml) {
        try {
            scene.setRoot(loadFXML(fxml));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Parent loadFXML(String fxml) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static Estudiante getEstudianteActual() {
        return estudianteActual;
    }

    public static void setEstudianteActual(Estudiante estudiante) {
        estudianteActual = estudiante;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
