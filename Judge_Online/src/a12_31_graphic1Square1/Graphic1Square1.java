package a12_31_graphic1Square1;
import java.util.Scanner;

public class Graphic1Square1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //Variables
        int lines = 0;
        char simbolo = ' ';
        
        //Pedimos lineas
        System.out.println("Enter number of lines:");
        lines = scanner.nextInt();
        
        //pedimos simbolo
        System.out.println("Enter character:");
        simbolo = scanner.next().charAt(0);
        
        //Ahora hacemos cada linea
        for (int i = 0; i < lines; i++) {
            
            //ahora procesamos las columnas
            for (int x = 0; x < lines; x++) {
                System.out.print(simbolo);
            }
            
            System.out.println(); //salto de linea
        }
    }
}