package Tema_2;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String binario;

        System.out.println("Dame un numero binario de 8 digitos: ");
        binario = teclado.nextLine();

        int decimal = Integer.parseInt(binario, 2);

        System.out.println("El numero " + binario + "es: " + decimal + " en decimal");
        teclado.close();
    }
}
