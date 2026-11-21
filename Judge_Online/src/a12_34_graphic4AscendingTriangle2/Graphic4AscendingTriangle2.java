package a12_34_graphic4AscendingTriangle2;
import java.util.Scanner;

public class Graphic4AscendingTriangle2 {
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
        for (int i = 0; i < lines; i++) { //AQUI LAS LINEAS
            
            //primer cuadrado de espacios decreciente
            for (int x = lines - i; x > 1; x--) {
                System.out.print(" ");
            }
            
            //segundo cuadrado de simbolos
            for (int z = 0; z <= i ; z++) {
                System.out.print(simbolo);
            }
            
            System.out.println(); //salto de linea
        }
    }
}