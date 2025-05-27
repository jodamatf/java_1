package Calse4;

import java.util.Scanner;

public class EstructurasControlFlujo

{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        int edad = sc.nextInt();

        System.out.println("Tiene permiso del padre");
        boolean padre = sc.nextBoolean();


        if( edad<=18){
            System.out.println("No es mayor de edad ");

            if(padre==true) {
                System.out.println("Puede salir porque tiene permiso delm padre");
            }
        }else {
            System.out.println("Es mayor de edad");
        }
    }
}
