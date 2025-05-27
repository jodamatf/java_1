package Calse4;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        System.out.println("Intriduzcva el número de la semana");
        Scanner sc = new Scanner(System.in);

        int diaDeLaSemana= sc.nextInt();

        switch (diaDeLaSemana){

            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("El");

        }
    }
}
