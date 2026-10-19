package gestortareas;

public class Main {
    public static void main(String[] args){

    GestorTareas gestor = new GestorTareas();
    gestor.anadir(new Tarea("Comprar pan"));
    gestor.anadir(new Tarea("Estudiar SQL"));
    gestor.eliminar(2);
    gestor.completar(5);
    gestor.listar();
}
        }

