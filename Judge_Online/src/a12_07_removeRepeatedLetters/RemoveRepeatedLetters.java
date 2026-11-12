package a12_07_removeRepeatedLetters;
import java.util.Scanner;

public class RemoveRepeatedLetters {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //Variables
        String text = "";
        char lletra = ' ';
        char recordar = ' ';
        String imprimir = "";
        // char incorporar = ' ';
        
        //Pedir entrada
        System.out.println("Enter a text: ");
        text = scanner.nextLine();
        
        if (text.isEmpty()) {
            System.out.println("Text not entered");
        } else {
            for (int i = 0; i < text.length(); i++) {
                
                lletra = text.charAt(i);
                String str = String.valueOf(lletra); //Cambiamos la letra que es un char a una string para poder comparar
                String str2 = String.valueOf(recordar);
                
                //Si la letra es igual a la anterior
                if (str.equals(str2)) {
                    imprimir = imprimir + ""; //no imprimimos nada
                } else {
                    imprimir = imprimir + lletra; //imprimimos la letra
                }
                
                recordar = lletra; //le actualizamos el valor
            }
            
            System.out.println("Clean text: " + imprimir);
        }
    }
}