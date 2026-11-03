package Tema_3;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);


    System.out.println("Dime un dia de la semana: ");
    String dia = teclado.nextLine();

    //.equals para comparar cadenas
    if (dia.equals("lunes") || dia.equals("Lunes")) {
    System.out.println("El lunes toca: Lenguaje de marcas");
    }
    else if (dia.equals("martes") || dia.equals("Martes")) {
    System.out.println("El martes toca: Base de datos");
    }
    else if (dia.equals("miercoles") || dia.equals("Miercoles")) {
    System.out.println("El miercoles toca: Sistemas informaticos");
    }
    else if (dia.equals("jueves") || dia.equals("Jueves")) {
    System.out.println("El jueves toca: Programacion");
    }
    else if (dia.equals("viernes") || dia.equals("Viernes")) {
    System.out.println("El viernes toca: Entornos de desarrollo");
    }
    else {
    System.out.println("Dato incorrecto");
}

teclado.close();
}
}
