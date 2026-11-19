/*
Escribe un programa que rellene un array con los 100 primeros números enteros en
orden ascendente y los muestre en pantalla.
 */

package Tema_7;

public class Ejercicio1 {
    public static void main(String[] args) {
        int [] numeros = new int [100];

        //Rellena el array con numeros
        for (int i=0; i < numeros.length; i++){
            numeros[i] = i + 1;
        }


        //Muestra el array enterp
        for (int i=0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}
