package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.event.ActionEvent;
import Model.Candidato;
import Model.CandidatoDAO;
import Model.Voto;
import Model.VotoDAO;
import Main.MainApp;

import java.util.List;

public class VotingController {
    @FXML
    private ListView<String> candidateListView;

    @FXML
    public void initialize() {
        CandidatoDAO candidatoDAO = new CandidatoDAO();
        List<Candidato> candidatos = candidatoDAO.obtenerTodosCandidatos();
        for (Candidato candidato : candidatos) {
            candidateListView.getItems().add(candidato.getNombre());
        }
        candidateListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    @FXML
    private void handleVote(ActionEvent event) {
        String selectedCandidate = candidateListView.getSelectionModel().getSelectedItem();
        if (selectedCandidate != null) {
            CandidatoDAO candidatoDAO = new CandidatoDAO();
            Candidato candidato = candidatoDAO.obtenerTodosCandidatos().stream()
                    .filter(c -> c.getNombre().equals(selectedCandidate))
                    .findFirst()
                    .orElse(null);

            if (candidato != null) {
                VotoDAO votoDAO = new VotoDAO();
                Voto voto = new Voto(MainApp.getEstudianteActual().getId(), candidato.getId());
                if (votoDAO.registrarVoto(voto)) {
                    System.out.println("Gracias por votar!");
                    MainApp.setRoot("MainView");
                } else {
                    System.out.println("Ya has votado por este candidato.");
                }
            }
        }
    }
}

