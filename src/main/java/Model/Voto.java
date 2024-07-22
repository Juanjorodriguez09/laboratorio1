package Model;

public class Voto {
    private int idEstudiante;
    private int idCandidato;

    public Voto(int idEstudiante, int idCandidato) {
        this.idEstudiante = idEstudiante;
        this.idCandidato = idCandidato;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    // Constructor, getters y setters
}
