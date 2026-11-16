package a12_17_forbiddenLetters1;
import java.util.Scanner;

public class ForbiddenLetters1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		String text = "";
		String prohibit = "ÇÑWZQX";
		char lletra_text = ' ';
		char lletra_prohibit = ' ';
		boolean encontrado = false; //para saber si hemos encontrado una letra prohibida
		
		//Pedimos un texto
		System.out.println("Enter a text:");
		text = scanner.nextLine();
		
		for (int i = 0; i < text.length(); i++) {
			lletra_text = text.charAt(i); //analizamos cada letra del texto introducido
			
			for (int x = 0; x < prohibit.length(); x++) {
				lletra_prohibit = prohibit.charAt(x); //Analizamos cada letra de las prohibidas
				
				if (Character.toUpperCase(lletra_text) == lletra_prohibit) {
					encontrado = true;
					break; //rompemos codigo, no hace falta que miremos si coincide con TODAS las letras prohibidas
				}
			}
			if (encontrado) {
		        break;
			}
		}
		
		//Mostrar reultats
		if (encontrado) {
			System.out.println("Text contains special letters");
		} else {
			System.out.println("Text does not contain special letters");
		}

	}

}
