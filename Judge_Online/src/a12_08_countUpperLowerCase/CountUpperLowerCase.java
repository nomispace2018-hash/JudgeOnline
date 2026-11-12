package a12_08_countUpperLowerCase;
import java.util.Scanner;

public class CountUpperLowerCase {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		String text = "";
		int uppercase = 0;
		int lowercase = 0;
		char lletra = ' ';
		
		//Pedimos texto
		System.out.println("Enter a text: ");
		text = scanner.nextLine();
		
		//Calculamos el largo de un texto
		int largo = text.length();
		
		if (text.isEmpty()) {
			System.out.println("Text not entered");
		} else {
			for (int i = 0; i < largo; i++) {
				lletra = text.charAt(i);
					
					if (Character.isUpperCase(lletra)) {
						uppercase++;
					} else if (Character.isLowerCase(lletra)) {
						lowercase++;
					}
			}
			
			//Imprimimos por pantalla
			System.out.println("Uppercase = " + uppercase);
			System.out.println("Lowercase = " + lowercase);
		}
	}
}
