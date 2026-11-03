package Tema_2;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        int MB;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un numero de Megabytes: ");
        MB = teclado.nextInt();
        System.out.println("El resultado es: " + MB * 1024 + "Kilobytes");
        teclado.close();
    }
}
