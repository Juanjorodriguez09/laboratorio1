package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import Model.Estudiante;
import Model.EstudianteDAO;
import Main.MainApp;

public class LoginController {
    @FXML
    private TextField studentIdField;

    @FXML
    private void handleLogin(ActionEvent event) {
        int id = Integer.parseInt(studentIdField.getText());
        EstudianteDAO estudianteDAO = new EstudianteDAO();
        Estudiante estudiante = estudianteDAO.obtenerEstudiante(id);
        if (estudiante != null) {
            MainApp.setEstudianteActual(estudiante);
            MainApp.setRoot("VotingView");
        } else {
            System.out.println("Estudiante no encontrado");
        }
    }
}
