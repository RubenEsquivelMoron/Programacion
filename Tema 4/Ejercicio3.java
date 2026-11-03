package Tema_4;
import java.util.Random;

public class Ejercicio_3 {
   
    public static void main(String[] args) {

        Random random = new Random();
        String palabra = "";
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int contador = 0;
        
        do{
            int numero = random.nextInt(26);
            palabra += letras.charAt(numero);
            contador++;
        }
        
        while(contador < 5);

        System.out.println(palabra);
        System.out.println(palabra.toLowerCase());
    }

}
