package a12_02_replaceSpaces;
import java.util.Scanner;

public class ReplaceSpaces {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		String text = "";
		boolean continuar = true;
		char caracter = ' ';
		String frase = "";
		String sustituir = "";
		
		//Pedimos un texto
		System.out.println("Enter text: ");
		text = scanner.nextLine();
		
		//Si el texto esta vacio
		if (text.isEmpty()) {
			System.out.println("Text not entered");
			continuar = false; //Cortamos codigo
		
		} else { //Si tiene contenido
			for (int i = 0; i < text.length(); i++) { //A "i" se le va sumando 1 hasta llegar al largo maximo de la palabra
				
				caracter = text.charAt(i); //A "caracter" le guardamos la posición de cada letra en base al valor de la variable "i"
				
				if (Character.isWhitespace(caracter)) { //Si "caracter" que almacena cada letra de la palabra (1 por 1) esta vacia o hay espacio, 
					sustituir = "_"; //Entonces a esta variable le guardamos un _
				} else {
					String str = String.valueOf(caracter); //Transformamos el caracter a un string
					sustituir = str; //En caso de que no haya espacio en blanco, la variable almacenara la letra correspondiente
				}
				frase = frase + sustituir;
			}
			System.out.println(frase);
		}
	}
}
