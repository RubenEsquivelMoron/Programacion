package Tema_2;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double radio, altura, volumen;

        System.out.println("Dime el radio del cono");
        radio = teclado.nextDouble();
        System.out.println("Dime la altura del cono");
        altura = teclado.nextDouble();

        volumen = (Math.PI * radio * radio * altura) / 3;

        //Aqui hago que el resultado DOUBLE me lo devuelva solo con 2 decimales (%.2f) y me haga un salto de linea
        System.out.printf("El volumen del cono es: %.2f%n", volumen);
        teclado.close();
        

    }
}
