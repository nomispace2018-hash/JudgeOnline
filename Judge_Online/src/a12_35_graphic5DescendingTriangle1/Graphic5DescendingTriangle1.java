package a12_35_graphic5DescendingTriangle1;
import java.util.Scanner;

public class Graphic5DescendingTriangle1 {
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
            
            //cuadrado invertido
            for (int x = i; x < lines; x++) {
                System.out.print(simbolo);
            }
            
            System.out.println(); //salto de linea
        }
    }
}