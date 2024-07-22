package controller;

import Main.MainApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {
    @FXML
    private Button loginButton;
    @FXML
    private Button voteButton;
    @FXML
    private Button resultsButton;

    @FXML
    private void handleLogin(ActionEvent event) {
        MainApp.setRoot("LoginView");
    }

    @FXML
    private void handleVote(ActionEvent event) {
        MainApp.setRoot("VotingView");
    }

    @FXML
    private void handleResults(ActionEvent event) {
        MainApp.setRoot("ResultsView");
    }
}
