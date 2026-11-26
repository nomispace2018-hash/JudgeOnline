package funcions;
import java.util.Scanner;

public class Metodes {
	
	//Metodo suma
	public static void suma() {
		int n1 = 10;
		int n2 = 20;
		System.out.println(n1 + n2);
	}
	
	//Metodo tradicional
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner("123 Avui fa bon dia"); //PARTE 1. ESTO ES UNA PRUEBA. Le damos una entrada al scanner.
		int num = scanner2.nextInt(); //PARTE 2. De la entrada que le dimos solo lee el numero porque es "next.Int()" y transforma el 123 (que esta en string) en un numero al asignarselo a una variable "INT".
		System.out.println(num); //PARTE 3. Imprime el numero.
		System.out.println(scanner2.next()); //PARTE 4. Imprime la siguiente palabra despues del espacio que hay en el numero "123" (es decir, la palabra "AVUI").
		System.out.println(scanner2.nextLine()); //PARTE 5. Imprime todas las palabras que hay en "scanner2" que sean STRING.
		
		
		//Lo que hay a continuacion, lo que hace es calcular e imprimir lo que hay dentro del "static void suma()" que está mas arriba.
		Metodes.suma(); //Nombre de la clase (metodes) + nombre del public static (suma). 
		suma(); //Esto es lo mismo que "Metodes.suma()". Si a otra clase le ponemos de static void el mismo nombre ("suma"), entonces, no podemos poner solo "suma()" porque se confundira el sistema, tenemos que indicar la clase, como en el ejemplo de arriba.
	}

	//Cuidado. ¡¡¡"VOID" indica que no devuelve NINGUN VALOR!!! En cambio, ¡¡¡"INT, DOUBE, BOOLEAN, STRING" devuelven valores en función del tipo de variable que son!!!
		
}
