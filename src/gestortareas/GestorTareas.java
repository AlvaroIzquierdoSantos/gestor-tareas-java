package gestortareas;

import java.util.ArrayList;

public class GestorTareas {
    private ArrayList<Tarea> tareas = new ArrayList<>();

    public void anadir(Tarea tarea) {
        tareas.add(tarea);
    }

    public void listar(){
        for (int i = 0; i < tareas.size(); i++){
            System.out.println((i + 1) + ". " + tareas.get(i));
        }
    }

    public void completar(int numero){
        Tarea tarea = tareas.get(numero - 1);
        tarea.completar();
    }
}