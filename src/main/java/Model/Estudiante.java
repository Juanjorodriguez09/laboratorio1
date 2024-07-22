package Model;

public class Estudiante {
    private int id;
    private String nombre;
    private String jornada;

    public Estudiante(int id, String nombre, String jornada) {
        this.id = id;
        this.nombre = nombre;
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

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    // Constructor, getters y setters
}
