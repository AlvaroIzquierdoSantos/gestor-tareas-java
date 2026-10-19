package gestortareas;

public class Main {
    public static void main(String [] args){
        Tarea t1 = new Tarea("Comprar pan");
        Tarea t2 = new Tarea("Estudiar SQL");
        t2.completar();
        System.out.println(t1.estaCompletada());
        System.out.println(t2.estaCompletada());

    }
}
