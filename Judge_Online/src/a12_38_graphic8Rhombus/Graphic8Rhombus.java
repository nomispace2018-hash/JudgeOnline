package a12_38_graphic8Rhombus;
import java.util.Scanner;

public class Graphic8Rhombus {
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
        
        //Ahora hacemos cada linea de la parte de arriba
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
        
        //Ahora procesamos la linea de abajo
        for (int i = 1; i < lines; i++) {
            
            //analizamos el primer traingulo vacio
            for (int x = 0; x < i; x++) {
                System.out.print(" ");
            }
            
            //procesamos el triangulo del medio invertido (primera mitad)
            for (int y = i; y < lines; y++) {
                System.out.print(simbolo);
            }
            
            //procesamos el tercer triangulo (la otra mitad)
            for (int z = i; z < lines - 1; z++) {
                System.out.print(simbolo);
            }
            
            System.out.println();
        }
        
    }
}