package a12_06_firstAndLastLetter;

import java.util.Scanner;

public class FirstAndLastLetter {
    public static void main(String[] args ) {
       
        Scanner scanner = new Scanner(System.in);
       
        //Variables
        String text = "";
        int palabrasRepetidas = 0;
        String imprimir = "";
        boolean aceptado = false;

        //Pedimos palabras
        System.out.println("Enter word: ");
        text = scanner.nextLine();
       

        //Si no introducen nada
        if (text.equalsIgnoreCase("end")) {
            System.out.println("No words entered");
        } else { //Si si introducen algo
            while (!text.equalsIgnoreCase("end")) {
               
                if (text.length() > 2 && Character.isLetter(text.charAt(0)) && Character.toLowerCase(text.charAt(0)) == Character.toLowerCase(text.charAt(text.length() - 1))) {
                    imprimir = imprimir + text + "\n";
                    palabrasRepetidas++;
                    aceptado = true;
                }
               
                //Pedimos otra entrada
                System.out.println("Enter word: ");
                text = scanner.nextLine();
            }
           
            if (aceptado) {
                System.out.println("Total words: " + palabrasRepetidas);
                System.out.print(imprimir);
            } else {
                System.out.println("No words entered");
            }
        }
    }
}