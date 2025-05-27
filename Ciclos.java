package Calse4;

public class Ciclos {

    public static void main(String[] args) {

        int contador=0;

        while (contador<=5){
            System.out.println(contador);
            contador++;
        }

        //El ciclo do-while inicia siempre la primera vez y luego verifica que se cumpla la condición

           contador=1;
        System.out.println("-----------------------------");

        do{
            System.out.println(contador);
            contador++;
        }while(contador<=5);

        System.out.println("-----------------------------");
        //Ciclo for

        contador=0;
        for (int i=0; i<=5;i++){
            System.out.println(i);
        }
//*********************************************************************************
        System.out.println("-----------------------------");

        int[] numeros = new int[5];

        numeros[0]=1;
        numeros[1]=2;
        numeros[2]=3;
        numeros[3]=4;
        numeros[4]=5;

        for(int i =0; i<numeros.length;i++){

            System.out.println(numeros[i]);
        }

//****************************************************
        //for each
        System.out.println("-----------------------------");
        for(int num:numeros){
            System.out.println("a"+num);
        }

    }
}
