package Tema_3;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime una hora: ");
        int hora = teclado.nextInt();

        if (hora >5 && hora <13){
            System.out.println("Buenos dias");
        }
        else if(hora >12 && hora <21){
            System.out.println("Buenas tardes");
        }
        else if ((hora > 20 || hora < 6) && hora < 24) {
            System.out.println("Buenas noches");
        }
        else if (hora >23){
            System.out.println("Hora no valida");
        }
        else System.out.println("Numero no valido");
        teclado.close();
    }
}
