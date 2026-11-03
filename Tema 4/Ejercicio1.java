package Tema_4;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, nota5;


        System.out.println("Nota 1: ");
        nota1 = teclado.nextDouble();
        System.out.println("Nota 2: ");
        nota2 = teclado.nextDouble();
        System.out.println("Nota 3: ");
        nota3 = teclado.nextDouble();
        System.out.println("Nota 4: ");
        nota4 = teclado.nextDouble();
        System.out.println("Nota 5: ");
        nota5 = teclado.nextDouble();

        
        double media = (nota1 + nota2 + nota3 + nota4 + nota5)/5;
        
        double maximo = Math.max(nota1, Math.max(nota2, Math.max(nota3, Math.max(nota4, nota5))));
        double minimo = Math.min(nota1, Math.min(nota2, Math.min(nota3, Math.min(nota4, nota5))));;
        
        
        System.out.println("----------------------------------------------");
        System.out.println("Redondeo al alza 1: " + Math.ceil(nota1));
        System.out.println("Redondeo al alza 2: " + Math.ceil(nota2));
        System.out.println("Redondeo al alza 3: " + Math.ceil(nota3));
        System.out.println("Redondeo al alza 4: " + Math.ceil(nota4));
        System.out.println("Redondeo al alza 5: " + Math.ceil(nota5));
        System.out.println("----------------------------------------------");
        System.out.println("Redondeo a la baja 1: " + Math.floor(nota1));
        System.out.println("Redondeo a la baja 2: " + Math.floor(nota2));
        System.out.println("Redondeo a la baja 3: " + Math.floor(nota3));
        System.out.println("Redondeo a la baja 4: " + Math.floor(nota4));
        System.out.println("Redondeo a la baja 5: " + Math.floor(nota5));
        System.out.println("----------------------------------------------");
        System.out.println("Nota truncada 1: " + Math.round(nota1));
        System.out.println("Nota truncada 2: " + Math.round(nota2));
        System.out.println("Nota truncada 3: " + Math.round(nota3));
        System.out.println("Nota truncada 4: " + Math.round(nota4));
        System.out.println("Nota truncada 5: " + Math.round(nota5));
        System.out.println("----------------------------------------------");
        System.out.printf("La media de las notas es: %.2f%n", media);
        System.out.printf("La nota maxima es: %.2f%n", maximo);
        System.out.printf("La nota minima es: %.2f%n", minimo);
        System.out.println("----------------------------------------------");

        teclado.close();




    }
}
