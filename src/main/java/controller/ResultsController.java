package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import Model.Candidato;
import Model.CandidatoDAO;

import java.util.List;

public class ResultsController {
    @FXML
    private ListView<String> resultsListView;

    @FXML
    public void initialize() {
        CandidatoDAO candidatoDAO = new CandidatoDAO();
        List<Candidato> candidatos = candidatoDAO.obtenerTodosCandidatos();
        for (Candidato candidato : candidatos) {
            resultsListView.getItems().add(candidato.getNombre() + ": " + contarVotos(candidato.getId()));
        }
    }

    private int contarVotos(int idCandidato) {
        // Implementar la lógica para contar votos de un candidato
        return 0; // Placeholder
    }
}
