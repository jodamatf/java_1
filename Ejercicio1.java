package Calse4;
import java.util.Scanner;


public class Ejercicio1 {

    public static void main(String[] args) {

//Determina si un número es positivo o negativo o cero

        System.out.println("Introduzca un número: ");

        Scanner sc = new Scanner(System.in);

        int num= sc.nextInt();

        if(num>0){
            System.out.println("El número es positivo");
        } else if (num==0) {
            System.out.println("el número es igual a cero");
        } else{
            System.out.println("El número es negativo");
        }

//Determina entre dos números el mayor, el menor o si son iguales

        System.out.println("Introduzca el primer número");
        int num1 = sc.nextInt();
        System.out.println("Introduzca el segundo número");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println(num1+ " es mayor que "+num2);
        } else if (num1<num2) {
            System.out.println(num1+ " es menor que "+ num2);
        }else{
            System.out.println( num1+" = "+num2 + " Los números son iguales");
        }
//año bisiesto

        System.out.println("Ingrese el año que desea determinar si es bisiesto");
        int ano = sc.nextInt();
        int anio = 0;
        if (ano%4==0 && ano%100!=0){
            System.out.println("El año es bisiesto ");

        } else if (ano%400==0) {
            System.out.println("El año es bisiesto\n");

        }else{
            System.out.println("El año no es bisiesto\n");
        }

// Calculadora
        System.out.println("Bienvenido a la minicalculadora\n");

        System.out.println("Ingresa el primer número");
        float number1 = sc.nextFloat();
        System.out.println("Ingrese el segundo número");
        float number2 = sc.nextFloat();

        System.out.println("Elija la operación a realizar");
        System.out.println("1. + ");
        System.out.println("2. - ");
        System.out.println("3. * ");
        System.out.println("4. / ");
        int opcion= sc.nextInt();

        switch (opcion){
            case 1:
                System.out.println(number1+number2);
                break;
            case 2:
                System.out.println(number1-number2);
                break;
            case 3:
                System.out.println(number1*number2);
                break;
            case 4:
                if(number2==0){
                    System.out.println("Recuerda que la división por cero no está definida.");
                }else{
                    System.out.println((number1/number2));
                }

        }


    }


}
