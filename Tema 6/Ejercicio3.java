/*
Ídem una versión que calcule el máximo de 3 números.
*/

import java.util.Scanner;

public class Ejercicio3 {
     public static void main(String[] args) {
        

        Scanner teclado = new Scanner(System.in);

        System.out.println("Esciba el primer numero: ");
        int numero1 = teclado.nextInt();
        System.out.println("Escriba el segundo numero");
        int numero2 = teclado.nextInt();
        System.out.println("Dame el tercer numero");
        int numero3 = teclado.nextInt();

        System.out.println(numeroMayor(numero1, numero2, numero3));

    }


    public static String numeroMayor (int num1, int num2, int num3){

        int maximo;
        maximo = Math.max(num3, Math.max(num1, num2));

        return "El numero mayor es: " + maximo; 
        
    }


}
