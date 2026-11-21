package a12_37_graphic7Pyramid;
import java.util.Scanner;

public class Graphic7Pyramid {
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
        for (int i = 1; i <= lines; i++) { //AQUI LAS LINEAS
            
            //primer triangulo invertido de espacios 
            for (int x = i; x < lines; x++) {
                System.out.print(" ");
            }
            
            //segundo triangulo normal de caracteres (la PRIMERA mitad del triangulo)
            for (int y = 1; y <= i; y++) {
                System.out.print(simbolo);
            }
            
            //tercer triangulo normal de caracteres (la SEGUNDa mitad del triangulo)
            for (int z = 1; z < i; z++) {
                System.out.print(simbolo);
            }
            
            System.out.println(); //salto de linea
        }
    }
}