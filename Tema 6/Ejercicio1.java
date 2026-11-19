/*
Crea una biblioteca de funciones matemáticas que contenga las siguientes
funciones. Recuerda que puedes usar unas dentro de otras si es necesario. 
Se deberá realizar un menú para poder ejecutarlas.

- esCapicua: Devuelve verdadero si el número que se pasa 
  como parámetro es capicúa y falso en caso contrario.
- potencia: Dada una base y un exponente devuelve la potencia.
- digitos: Cuenta el número de dígitos de un número entero.
- voltea: Le da la vuelta a un número.
- quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
- pegaPorDelante: Añade un dígito a un número por delante.
*/

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    int menu;

    do{
    

    System.out.println("-------------MENU-------------");
    System.out.println("1.¿Capicuo?.------------------");
    System.out.println("2.Potencia.-------------------");
    System.out.println("3.Digitos.--------------------");
    System.out.println("4.Voltea.---------------------");
    System.out.println("5.Quita por detrás.-----------");
    System.out.println("6.Pega por delante.-----------");
    System.out.println("7.Cerrar programa.------------");

    menu = teclado.nextInt();

    switch(menu){

        case 1:

        int numcap;
            do{
                    System.out.println("Dime un numero");
                    numcap = teclado.nextInt();
                    capicuo(numcap);
                    System.out.println(capicuo(numcap));
              }
                    while (numcap > 99999 || numcap < 10);

            break;
        case 2:
            System.out.println("Dame una base");
            long base = teclado.nextInt();
            System.out.println("Dame un exponente");
            long exponente = teclado.nextInt();

            System.out.println(base + " elevado a " + exponente + " es: " + potencia(base, exponente));

            break;
        case 3:
              System.out.println("Dime un numero");
              int numdigi = teclado.nextInt();
              // llamada al metodo
              System.out.println(digito(numdigi));



            
            break;
        case 4:
            System.out.println("Introduce un numero");
            int numeroV = teclado.nextInt();

            System.out.println(voltea(numeroV));

            break;
        case 5:
            System.out.print("Introduce un número: ");
            int numero = teclado.nextInt();

            System.out.print("¿Cuántos dígitos quieres quitar?: ");
            int quitar = teclado.nextInt();

            System.out.println(quitar(numero,quitar));

            break;
        case 6:
        System.out.print("Introduce un número: ");
        int numbase = teclado.nextInt();

        System.out.print("¿Qué número quieres añadir por delante?: ");
        int añadir = teclado.nextInt();

        System.out.println(poner(numbase, añadir));
        break;
        case 7:
            System.out.println("Programa finalizado");
            break;

                }
      } while (menu > 7 || menu < 1);

                                            }       


public static long potencia(long b, long e) {
        int p = 1;

        for (int i = 1 ; i <=e; i++)
            p *= b;
        return p;
                                            }
    
public static String capicuo(int numero){

        
        int original;
        int invertido = 0;
        
        original = numero;

        while (numero > 0){
            int ultimoNumero = numero % 10; // Obtiene el ultimo numero del digito escrito
            invertido = invertido * 10 + ultimoNumero; // Construye el numero invertido
            numero = numero / 10; // Elimina la ultima cifra
        }

        if (original == invertido){
            
            return"El numero SI es capicuo";     
        }
        else {
            return"El numero NO es capicuo";    
        }

        

                                        }

public static String digito(int numdig){

     int digito = String.valueOf(Math.abs(numdig)).length();
     return"Tu numero tiene " + digito + " digitos";

}

public static int voltea(int voltear){

    int invertido = 0;

        while (voltear > 0) {
            int digito = voltear % 10;
            invertido = invertido * 10 + digito;
            voltear = voltear / 10;
        }

        return invertido;
}                  

public static String quitar(int numero, int quitados){

 for (int i = 0; i < quitados; i++) {
            numero = numero / 10;
        }

        return"Resultado: " + numero;
}
                       
public static String poner(int numero, int agregar){

    int digitos = String.valueOf(Math.abs(numero)).length();

    int resultado = (int) (agregar * Math.pow(10, digitos) + numero);

    return"Resultado: " + resultado;
}


}
