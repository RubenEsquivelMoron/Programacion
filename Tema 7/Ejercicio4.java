/*

*/

package Tema_7;

public class Ejercicio4 {
    public static void main(String[] args) {
         int[] numeros = new int[50];

        // Rellenar el array
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (i * 2) + 1;
        }

        // Mostrar los números
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
