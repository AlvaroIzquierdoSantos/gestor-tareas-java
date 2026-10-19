package gestortareas;

public class Tarea {
    private String titulo;
    private boolean completada;

    public Tarea(String titulo) {
        this.titulo = titulo;
        this.completada = false;
    }

    public void completar() {
        this.completada = true;
    }

    @Override
    public String toString() {
        if (completada) {
            return "[x] " + titulo;
        }
        return "[] " + titulo;
    }

    public boolean estaCompletada(){
        return completada;
    }

}



