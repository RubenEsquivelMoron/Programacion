package Tema_3;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int original;
        int invertido = 0;
        do{
        System.out.println("Dime un numero");
        numero = teclado.nextInt();
        }
        while (numero > 99999 || numero < 10);

        original = numero;

        while (numero > 0){
            int ultimoNumero = numero % 10; // Obtiene el ultimo numero del digito escrito
            invertido = invertido * 10 + ultimoNumero; // Construye el numero invertido
            numero = numero / 10; // Elimina la ultima cifra
        }

        if (original == invertido){
            System.out.println("El numero es capicuo");
        }
        else {
            System.out.println("El numero NO es capicuo");
        }
        teclado.close();

    }
}
