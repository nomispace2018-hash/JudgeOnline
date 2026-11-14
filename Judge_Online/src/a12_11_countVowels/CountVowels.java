package a12_11_countVowels;
import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
		
		//Variables
		String vowels = "AÀÁÄÂEÈÉËÊIÍÌÏÎOÒÓÖÔUÙÚÜÛ";
		char vocal = ' ';
		char lletra = ' ';
		int cantidad = 0;
		
		//Introduce texto
		System.out.println("Enter text: ");
		String text = scanner.nextLine();
		
		
		if (text.isEmpty()) {
		    System.out.println("Text not entered");
		} else {
		    // Recórrer les vocals
    		for (int i = 0; i < vowels.length(); i++) {
    			vocal = vowels.charAt(i);
    			String str = String.valueOf(vocal);
    			
    			// Recórrer el text
    			for (int x = 0; x < text.length(); x++) {
    			    lletra = text.charAt(x);
    			    String str2 = String.valueOf(lletra);
    				
    				// Comprova si el caràcter actual coincideix amb la vocal			
    			    if (str2.equalsIgnoreCase(str)) {
    			        cantidad++;
    			    }
    			}
    		}
    		// Mostra resultats	
			System.out.println("Quantity of vowels: " + cantidad);
		}
	}

}