package Tema_3;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Nota del primer examen: ");
        double nota1 = teclado.nextDouble();

        System.out.println("Nota del segundo examen: ");
        double nota2 = teclado.nextDouble();
        teclado.nextLine();

        double media = (nota1 + nota2) / 2;

        if (nota1 >= 5 && nota2 >= 5) {
            System.out.printf("Felicidades!! Tu nota media es: %.2f%n", media);
        } else {
            String recuperacion;

            do {
                System.out.println("¿Qué calificación has sacado en la recuperación (apto/no apto)?");
                recuperacion = teclado.nextLine();
            } while (!recuperacion.equalsIgnoreCase("apto")
                    && !recuperacion.equalsIgnoreCase("no apto"));

            if (recuperacion.equalsIgnoreCase("apto")) {
                System.out.println("Felicidades!! Has aprobado con un 5");
            } else {
                System.out.printf("Tu nota media es: %.2f%n", media);
            }
        }

        teclado.close();
    }
}
