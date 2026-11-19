/*
Realizar una función que calcule (muestre en pantalla) volumen de un cilindro. 
Además hemos de pasarle a la función el radio y la altura.
*/

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime el radio");
        double radio = teclado.nextDouble();
        System.out.println("Dime la altura");
        double altura = teclado.nextDouble();

        System.out.printf("El volumen es: ");
        System.out.printf(String.format("%.2f", volumen(radio, altura)));
    }

    public static double volumen(double radio, double altura){

    double resultado = 2 * Math.PI * radio * (altura + radio);
    return resultado;
    }
}
