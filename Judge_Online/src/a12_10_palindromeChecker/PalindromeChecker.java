package a12_10_palindromeChecker;
import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		String palabra = "";
		String word = "";
		char lletra = ' ';
		String fraseInversa = "";
		boolean palindrome = true;
		
		//Pedimos la palabra
		System.out.println("Enter word: ");
		palabra = scanner.nextLine();
		
		//Calculamos el largo de la palabra (cuantos caracteres)
		int largo = palabra.length();
		
		//Transformamos a minusculas
		word = palabra.toUpperCase();
		
		if (word.isEmpty()) {
			System.out.println("Word not entered");
		} else {
			for (int i = 0; i < largo; i++) {
				lletra = word.charAt(i);
				
				fraseInversa = lletra + fraseInversa;
			}
			
			//Si la frase invertida es igual que la original
			if (!fraseInversa.equals(word)) {
				palindrome = false;
			}else {
				palindrome = true;
			}
			
			//Imprimimos por pantalla
			System.out.println("Palindrome: " + palindrome);
		}
	}
}