package Calse4;

import java.util.Scanner;

public class switch2 {

    public static void main(String[] args) {

        System.out.println("Intriduzca el número de la semana");
        Scanner sc = new Scanner(System.in);

        int diaDeLaSemana= sc.nextInt();

        String respuesta = switch (diaDeLaSemana){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6,7 -> "Fin de semana";
            default -> "El numero de la semana no existe";
        };
        System.out.println(respuesta);
    }
}
