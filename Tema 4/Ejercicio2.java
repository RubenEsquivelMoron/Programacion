package Tema_4;


public class Ejercicio_2 {
    public static void main(String[] args) {
        
        String numero;
        String palo = "";


        double numtemp = (int) (Math.random() * 13) + 1;

        if(numtemp == 11){
            numero = "J";
        }
        else if(numtemp == 12){
            numero = "Q";
        }
        else if(numtemp == 13){
            numero = "K";
        }
        else if(numtemp == 1){
            numero = "A";
        }
        else{
            numero = String.valueOf(numtemp);
            numero = String.valueOf((int) numtemp);
        }

        /*-----------------------------------------------------------*/

        double palotemp = (int) (Math.random() * 4);

        if(palotemp == 0){
            palo = "Picas";
        }
        else if(palotemp == 1){
            palo = "Corazones";
        }
        else if(palotemp == 2){
            palo = "Diamantes";
        }
        else if(palotemp == 3){
            palo = "Treboles";
        }
        
        System.out.println("Tu carta es: " + numero + " de " + palo);

    }
}
