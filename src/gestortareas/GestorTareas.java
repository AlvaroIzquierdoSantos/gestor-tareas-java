package gestortareas;

import java.util.ArrayList;

public class GestorTareas {
    private ArrayList<Tarea> tareas = new ArrayList<>();

    private boolean numeroValido(int numero){
      if (numero < 1 || numero > tareas.size()){
          System.out.println("No existe la tarea " + numero);
          return false;
      }
      return true;
    }


    public void anadir(Tarea tarea) {
        tareas.add(tarea);
    }

    public void listar(){
        for (int i = 0; i < tareas.size(); i++){
            System.out.println((i + 1) + ". " + tareas.get(i));
        }
    }

    public void completar(int numero){
        if (!numeroValido(numero)){
            return;
        }
        Tarea tarea = tareas.get(numero - 1);
        tarea.completar();
    }

    public void eliminar(int numero){
        if (!numeroValido(numero)){
            return;
        }
        tareas.remove(numero - 1);
    }
}