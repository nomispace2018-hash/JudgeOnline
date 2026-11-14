package a12_05_reverseString;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args ) {
       
        Scanner scanner = new Scanner(System.in);
       
        //Variables
        String text = "";
        char lletra = ' ';
        String imprimir = "";
       
        //Pedir entradas
        System.out.println("Enter a text: "); //Hola
        text = scanner.nextLine();
       
        //Si el texto esta vacío
        if (text.isEmpty()) {
            System.out.println("Text not entered");
        } else { //Si no esta vacío
            for (int i = 0; i < text.length(); i++) { //i=0, i=1
                lletra = text.charAt(i); //"H", "o"
               
                imprimir = lletra + imprimir; //H, oH,
            }
           
            System.out.println(imprimir);
        }
    }
}