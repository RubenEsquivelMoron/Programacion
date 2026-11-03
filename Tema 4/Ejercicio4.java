package Tema_4;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {

       Scanner teclado = new Scanner(System.in); 
       long numero;
       int posicion;
       int numeronuevo;

        System.out.println("Por favor, introduzca un número entero positivo: ");
        numero = teclado.nextLong();
        System.out.println("Introduzca la posición donde quiere insertar:");
        posicion = teclado.nextInt();
        System.out.println("Introduzca el dígito que quiere insertar:");
        numeronuevo = teclado.nextInt();

        // Convertimos el número a String
        String num = String.valueOf(numero);

        // Insertamos el nuevo dígito
        String resultado = num.substring(0, posicion) + numeronuevo + num.substring(posicion);

        // Convertimos el resultado a long
        numero = Long.parseLong(resultado);


        System.out.println("El numero resultante es: " + numero);


    }
    
}
