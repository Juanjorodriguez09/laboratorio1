package Model;

public class Candidato {
    private int id;
    private String nombre;
    private String jornada;
    private String foto;

    public Candidato(int id, String nombre, String foto, String jornada) {
        this.id = id;
        this.nombre = nombre;
        this.foto = foto;
        this.jornada = jornada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    // Constructor, getters y setters
}
