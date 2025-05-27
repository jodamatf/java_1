package Calse4;
 import java.util.Scanner;

public class Promedio {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el primer : ");
        int num1 = sc.nextInt();

        System.out.println("Escriba el segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("Escriba el tercer número: ");
        int num3 = sc.nextInt();

        int suma = num1 + num2 +num3;

        float promedio = (suma/3F);

        System.out.println("El promedio es: " + promedio);



    }
}
