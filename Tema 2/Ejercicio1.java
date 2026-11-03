package Tema_2;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        int salario = 12;
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantas horas ha trabajado esta semana?");
        int numero = sc.nextInt();
       
        
        System.out.println("Su salario es de: " + numero * salario);
        sc.close();
    }
}
