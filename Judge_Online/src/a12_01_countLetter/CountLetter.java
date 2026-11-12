package a12_01_countLetter;
import java.util.Scanner;

public class CountLetter {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		String paraula = "";
		char lletra = ' ';
		int repeticiones = 0;
		char mirar = ' ';
		boolean continuar = true; //Para romper codigo en un if
		
		//Pedimos palabra
		System.out.println("Enter text: ");
		paraula = scanner.nextLine();
		
		//Si no introducen nada
		if (paraula.isEmpty()) {
			System.out.println("Text not entered");
			continuar = false;
		} else { //Si si introducen algo
			//Pedimos letra a buscar
			System.out.println("Enter letter: ");
			lletra = scanner.next().charAt(0); //Con "charAt(0)" decimos que mire la posición 0, como es una letra, la posición 0 siempre sera la letra que se introduzca
			
			//Calculamos
			for (int i = 0; i < paraula.length(); i++) {
				mirar = paraula.charAt(i); //Guardamos la posicion de cada letra de cada vuelta en la palabra
								
				if (Character.toLowerCase(mirar) == Character.toLowerCase(lletra)) { //Si el char (transformado a string) es igual a la letra
					repeticiones++;
				}
			}
			
			//Devolvemos
			System.out.println("Occurrences: " + repeticiones);
		}
	}
}
