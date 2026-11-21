package a12_20_uniqueVowels;
import java.util.Scanner;

public class UniqueVowels {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //variables
        String vowels = "AEIOUÀÈÒÙÁÉÍÓÚÄËÏÖÜÂÊÎÔÛ";
        String text = ""; //Para pedir texto
        String vocalesEncontradas = ""; //para recordar vocales

        //Pedimos texto
        System.out.println("Enter text:");
        text = scanner.nextLine();
        
        if (text.isEmpty()) {
            System.out.println("Text not entered");
        } else {
            //Analizamos el txto
            for (int i = 0; i < text.length(); i++) {
                char lletraText = text.charAt(i);
                boolean encontrado = false;
                boolean vocalRepetida = false;
                
                //analizamos vocales
                for (int x = 0; x < vowels.length(); x++) {
                    char vocal = vowels.charAt(x);
                    
                    //si la letra que estamos analizando es igual a una vocal
                    if (Character.toUpperCase(lletraText) == vocal) {
                        encontrado = true;
                        break; //rompemos codigo para analizar si esta entre alguna vocal ya encontrada
                    }
                }
                
                //analizamos si la vocal letra encontrada es igual a alguna vocal encontrada
                if (encontrado) {
                    for (int z = 0; z < vocalesEncontradas.length(); z++) {
                        char vocalEncontrada = vocalesEncontradas.charAt(z);
                        
                        //si la letra/vocal ya la habiamos encontrado 
                        if (Character.toUpperCase(lletraText) == Character.toUpperCase(vocalEncontrada)) { 
                            vocalRepetida = true;
                            break; //rompemos codigo
                        //si no encontramos la vocal, "vocalRepetida" seguira siendo false y pasamos al siguiente bloque, no ponemos un else aqui dentro porque si comparamos la letra con la primera vocal encontrada en "vocalesEncontradas" y no es igual, entonces la almacenara, incluso si despues de la primera vocal se encuentra la misma vocal que esta letra
                        }
                    }
                    if (!vocalRepetida) { //si vocal repetida es false (no la encontramos)
                       vocalesEncontradas = vocalesEncontradas + lletraText;
                    }
                }
            }
            //imprimimos resultados
            System.out.println("Unique vowels found: " + vocalesEncontradas.toUpperCase());
        }
    }
}