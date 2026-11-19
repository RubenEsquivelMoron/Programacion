/*
Diseñar una función que tenga como parámetros dos números, y que calcule el máximo.
*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        

        Scanner teclado = new Scanner(System.in);

        System.out.println("Esciba el primer numero: ");
        int numero1 = teclado.nextInt();
        System.out.println("Escriba el segundo numero");
        int numero2 = teclado.nextInt();

        System.out.println(numeroMayor(numero1, numero2));

    }

    public static String numeroMayor (int num1, int num2){

        if(num1 > num2)
            return"El numero " + num1 + " es mayor que el numero " + num2;
        else
            return"El numero " + num2 + " es mayor que el numero " + num1;
    }
    
}
