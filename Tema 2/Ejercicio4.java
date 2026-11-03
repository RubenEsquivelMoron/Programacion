package Tema_2;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        double KB;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un numero de Kilobytes: ");
        KB = teclado.nextInt();
        System.out.println("El resultado es: " + KB / 1024 + " Kilobytes");
        teclado.close();
    }
}
