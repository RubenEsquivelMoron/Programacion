/*
Que rellene un array con los números pares comprendidos entre 1 y 100 y los muestre en
pantalla en orden ascendente. */



package Tema_7;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] numeros = new int[50];

        // Rellenar el array
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (i + 1) * 2;
        }

        // Mostrar los números
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
