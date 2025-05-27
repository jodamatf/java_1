package Calse4;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        //Las listas son estructuras dinámicas, son más pesadas


        List<String> estudiantes = new ArrayList<String>();
        estudiantes.add("jose");
        estudiantes.add("Daniel");
        estudiantes.add("Dana");

        System.out.println(estudiantes.get(0));
        System.out.println(estudiantes.getFirst());
        System.out.println(estudiantes.getLast());
        System.out.println(estudiantes.size());
        estudiantes.remove("jose");
        System.out.println(estudiantes);
    }
}
