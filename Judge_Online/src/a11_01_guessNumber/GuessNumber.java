package a11_01_guessNumber;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		//variables
		int attempts = 0;
		int guess = 0;
		
		//Pedimos el numero de intentos
		System.out.println("Enter number of attempts (grater than 1):");
		attempts = scanner.nextInt();
		
		//Si el valor introducido no es valido
		while (attempts <= 1) {
			System.out.println("Enter number of attempts (grater than 1):");
			attempts = scanner.nextInt(); //Lo volvemos a pedir
		}
		
		for (int intents = 1; intents <= attempts; intents++) {
			
			// Imprimimos el intento en cada iteración del bucle para que aumente solo
			System.out.printf("Attempt %d: Enter your guess (1..10):%n", intents);
    		guess = scanner.nextInt();
			
			//Si el valor no es valido
    		while (guess < 1 || guess > 10) {
    			System.out.printf("Attempt %d: Enter your guess (1..10):%n", intents);
    			guess = scanner.nextInt(); //Lo volvemos a pedir sin aumentar los intentos
    		}
			
			//Miramos si el valor de guess es valido, 
			if (guess == 7) {
				break;
			} else if (guess > 7) { //si es mayor que el numero secreto (7)
				System.out.print("Too high. "); // Quitamos el texto repetido de aquí para que el bucle imprima el siguiente "Attempt" limpio
			} else if (guess < 7) { //si es menor que el numero secreto (7)
				System.out.print("Too low. "); // Lo mismo aquí
			}
			
		}
		
		//Si no introdujeron ningun valor valido y ya acabaron los intentos
		if (guess != 7) {
			System.out.print("You lost! The secret number was 7.");
		} else {
		    System.out.println("Correct! You guessed the number.");
		}
		
	}
}