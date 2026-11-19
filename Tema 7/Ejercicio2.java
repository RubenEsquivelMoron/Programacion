/*
Escribe un programa que rellene un array con los 100 primeros números enteros en
orden descendente y los muestre en pantalla.
 */

package Tema_7;
public class Ejercicio2 {
   public static void main(String[] args) {
        int[] numeros = new int[100];

        // Rellenar el array
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 100 - i;
        }

        // Mostrar los números
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
