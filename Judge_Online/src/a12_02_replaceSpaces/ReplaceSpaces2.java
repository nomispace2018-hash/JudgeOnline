package a12_02_replaceSpaces;

import java.util.Scanner;

public class ReplaceSpaces2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Variables
        String text = "";
        char lletra = ' ';
        char guardar = ' ';
        String imprimir = "";
        
        // Demanem el text
        System.out.println("Enter text: ");
        text = scanner.nextLine();
        
        if (text.isEmpty()) {
            System.out.println("Text not entered");
        } else {
            for (int i = 0; i < text.length(); i++) {
                lletra = text.charAt(i);
                
                if (Character.isWhitespace(lletra)) {
                    guardar = '_';
                } else {
                    guardar = lletra;
                }
                
                imprimir = imprimir + guardar;
            }
            System.out.println(imprimir);
        }
    }
}