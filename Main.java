package Calse4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println( "Introduzca el primer nombre; ");
        String nombre = sc.nextLine();
        System.out.println("____________________________________________");


        System.out.println("Ingrese su edad");
        long edad = sc.nextLong();

        System.out.println(("-------------------------------------"));

        System.out.println("Su nombre es " + nombre +" y su edad es " + edad);

        sc.close();
    }




}
