package a12_03_splitLettersDigits;
import java.util.Scanner;

public class SplitLettersDigits {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		String texto = "";
		char letra = ' ';
		String digitos = "";
		String letters = "";
		
		//Pedimos el texto
		System.out.println("Enter text: ");
		texto = scanner.nextLine();
		
		//Si no introducen nada
		if (texto.isEmpty()) {
			System.out.println("Text not entered");
		} else { //Si introduce algo
			//Calculamos la posición de cada letra
			for (int i = 0; i < texto.length(); i++) {
				letra = texto.charAt(i); //Almacenamos la posicion de cada letra (1x1) por orden
				
				String letra_str = String.valueOf(letra); //Como luego tendremos que rehacer la frase en un string, convertimos la letra en un string
				
				if (Character.isWhitespace(letra)) { //Si hay un espacio o en blanco
					letra_str = "";
				} else if (Character.isDigit(letra)) { //si es un digito
					digitos = digitos + letra_str;
				} else if (Character.isLetter(letra)){ //Si no, almacenamos la variable
					letters = letters + letra_str;
				}
			}
			System.out.println("Letters: " + letters);
			System.out.println("Digits: " + digitos);
		}
	}
}