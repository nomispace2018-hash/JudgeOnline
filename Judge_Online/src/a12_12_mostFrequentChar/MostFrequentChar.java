package a12_12_mostFrequentChar;
import java.util.Scanner;

public class MostFrequentChar {

	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
		
		//Variables
		String text = "";
		int repetit = 1;
		char lletra_mes_repetida = ' ';
		char lletraOriginal = ' ';
		char lletraComparar = ' ';
		int recordar = 0;
		
		//Pedimos texto
		System.out.println("Enter text:");
		text = scanner.nextLine();
		
		//Cada por individual letra debe de compararse con cada letra siguiente. Al final, se le suma cuantas veces se repite. Si la siguiente letra se repite mas, se actualiza el maximo.
		for (int i = 0; i < text.length(); i++) {
		    lletraOriginal = Character.toLowerCase(text.charAt(i));
		    repetit = 1;
		    
		    for (int x = i + 1; x < text.length(); x++) {
		        lletraComparar = Character.toLowerCase(text.charAt(x));
		        
		        if (lletraOriginal == lletraComparar) {
		            repetit++;
		        }
		    }
		    
		    if (repetit > recordar) {
		        recordar = repetit; //recordar almacena el valor de las ultimas repeticiones pq luego se borra el valor de repetir
		        lletra_mes_repetida = lletraOriginal;
		    }    
		}
		
		if (recordar == 1) {
		    System.out.println("Most freqüent character: '" + lletra_mes_repetida + "' appears " + recordar + " time");
		} else {
		    System.out.println("Most freqüent character: '" + lletra_mes_repetida + "' appears " + recordar + " times");
		}
	}
}