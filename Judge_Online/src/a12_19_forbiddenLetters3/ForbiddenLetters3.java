package a12_19_forbiddenLetters3;
import java.util.Scanner;

public class ForbiddenLetters3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		String text = "";
		String prohibit = "ÇÑWZQX";
		char lletra_text = ' ';
		char lletra_prohibit = ' ';
		boolean encontrado = false; //para saber si hemos encontrado una letra prohibida
		String imprimir = "";
		boolean repetida = false;
		
		//Pedimos un texto
		System.out.println("Enter a text:");
		text = scanner.nextLine();
		
		for (int i = 0; i < text.length(); i++) {
			lletra_text = text.charAt(i); //analizamos cada letra del texto introducido
			encontrado = false; //Lo reiniciamos
			
			for (int x = 0; x < prohibit.length(); x++) {
				lletra_prohibit = prohibit.charAt(x); //Analizamos cada letra de las prohibidas
				
				if (Character.toUpperCase(lletra_text) == lletra_prohibit) {
					encontrado = true;
					break; //rompemos codigo, no hace falta que miremos si coincide con TODAS las letras prohibidas
				}
			}
			if (encontrado) { //si hemos encontrado una letra prohibida
				repetida = false; //reiniciamos
				
				for (int z = 0; z < imprimir.length(); z++) { //miramos cada letra que haya en imprimir
					char lletra_imprimir = imprimir.charAt(z); //guardamos cada letra que haya en la variable imprimir, que imprime las letras prohibidas y NO repetidas
					
					if (Character.toLowerCase(lletra_text) == lletra_imprimir) { //si la letra ya esta en imprimir, no hacemos nada
						repetida = true;
						break; //rompemos codigo
					}
				}
		        if (!repetida) { //Si la letra NO esta repetida
		            imprimir = imprimir + Character.toLowerCase(lletra_text); //se imprime y todo en minusculas porque lo pide el enunciado
		        	
		        }
			}			
		}
		
		//Mostrar reultats
		if (!imprimir.isEmpty()) {
			System.out.println("Text contains special letters");
			System.out.println("Forbidden letters: " + imprimir);
		} else {
			System.out.println("Text does not contain special letters");
		}

	}

}
