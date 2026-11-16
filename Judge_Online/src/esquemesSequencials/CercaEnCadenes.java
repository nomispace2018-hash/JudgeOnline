package esquemesSequencials;

public class CercaEnCadenes {

	public static void main(String[] args) {
		
		/*Problema 1
		String text = "Bon dia, quin dilluns més...";
		int llarg = text.length();
		char lletra = ' ';
		int quantitat = 0;
		
		//Comptar quantes "a" hi ha en el text
		for (int i = 0; i < llarg; i++) { //Por cada letra de la frase que hay en la variable "text"
			lletra = text.charAt(i);
			
			if (lletra == 'a') {
				quantitat++;
			}
			
		}
		System.out.println("Quantitat de A's: " + quantitat); */
		
		
		/*Problema 2
		//El text conté alguna "a"?
		//CERCA PER EL TEXT FINS QUE TROBEM UNA A O ARRIBEM A UNA
		
		String text = "Bon dia, aaaaAA dilluns més...";
		boolean trobat = false; //No hemos encontrado una "A" todavia
		int llarg = text.length();
		char lletra = ' ';
		
		for (int i = 0; i < llarg && trobat == false; i++) { //Mientras la cantidad de letras leidas sea inferior a la cantidad total de letras que hay en el texto Y no hayamos encontrado ninguna "A"
			lletra = text.charAt(i);
			
			if (lletra == 'A' || lletra == 'a') {
				trobat = true; //La hemos encontrado! Dejamos de buscar.
				
			}
		}
		if (trobat) { //Si lo hemos encontrado (es lo mismo que "trobat == true")
			System.out.println("Hem trobat alguna A");
		} else {
			System.out.println("No hi ha cap A"); */
		
		
		/*Problema 3
		//El mismo que el problema 2 pero con un BREAK
		
		String text = "Bon dia, aaaaAA dilluns més...";
		int llarg = text.length();
		char lletra = ' ';
		
		for (int i = 0; i < llarg; i++) { //Mientras la cantidad de letras leidas sea inferior a la cantidad total de letras que hay en el texto
			lletra = text.charAt(i); //Buscamos cada letra por si hay una A
			
			if (lletra == 'A' || lletra == 'a') { //Si encontramos una A
				break; //Ya la hemos encontrado, rompemos el código	
			}
		} */
		
		
		//Problema 4
		//Comptar quantes lletres del text no són vocals
		
		String text = "Bon dia, aaaaAA dilluns més...";
		String vocales = "AEIOU";
		int llarg = text.length();
		char lletra_text = ' ';
		char lletra_vocal = ' ';
		int noVocals = 0;
		boolean esVocal = false;
		
		for (int i = 0; i < llarg; i++) {
			lletra_text = text.charAt(i); //Miramos cada letra del texto
			
			for (int x = 0; x < vocales.length(); x++) {
				lletra_vocal = vocales.charAt(x);  //Comparamos cada letra del texto, una por una, con CADA vocal
				esVocal = false; //Reiniciamos el valor de esta boleana que determina si una letra es una vocal O NO (porque si detecta una vocal, siempre se quedaria en "true")
				
				if (Character.toUpperCase(lletra_text) == lletra_vocal) { //Por cada letra del texto, si alguna coincide con ninguna de las vocales, entonces;
					esVocal = true; //Salimos del codigo, no hace falta que comprobemos si esa letra es "A, E, I, O" o "U" porque ya sabemos que es alguna de esas vocales.
					break; //Recomiendo usar break siempre, aunque algunos codigos pueden funcionar sin el
				}
			}
			if (Character.isLetter(lletra_text) && !esVocal) { //Como el texto contiene otros caracteres (como comas), solo sumamos las que son LETRAS y NO son vocales.
				noVocals++;
			}
		}
		System.out.println("Total de lletres que NO son vocals: " + noVocals);
	}
}
