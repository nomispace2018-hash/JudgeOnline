package a12_39_graphic14PyramidRandom;
import java.util.Random;
import java.util.Scanner;

public class Graphic9PyramidRandom {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); //para elegir un numero aleatorio
        
        //Variables
        int lines = 0;
        String letters = "+~ox*O";
        char estrella = '\u2606';
        
        
        //Pedimos lineas
        System.out.println("Enter number of lines:");
        lines = scanner.nextInt();
        
        
        //Ahora hacemos cada linea de la parte de arriba
        for (int i = 1; i <= lines; i++) { //AQUI LAS LINEAS
            
            //primer triangulo invertido de espacios 
            for (int x = i; x < lines; x++) {
                System.out.print(" ");
            }
            
            //imprimimos la estrella
            if (i == 1) {
                System.out.print(estrella);
            } else {
                //segundo triangulo normal de caracteres (la PRIMERA mitad del triangulo)
                for (int y = 2; y <= i * 2; y++) {
                    int numAleatori = random.nextInt(6); //per seleccionar entre 0 i 5, cuenta desde 0 un total de 6 numeros (0,1,2,3,4,5)
                    System.out.print(letters.charAt(numAleatori));
                }
            }
            
            System.out.println(); //salto de linea
        }
        
    }
}