package a11_05_tokenAnalyzer;
import java.util.Scanner;

public class TokenAnalyzer {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //Variables
        long token = 0;
        int smallTokens = 0;
        int biggerTokens = 0;
        int deniedTokens = 0;
        String bigger = "";
        String smaller  = "";
        String denied = "";

        //Pedimos tokens
        while (true) {
            System.out.println("Enter Token ID:");
            token = scanner.nextLong();
            
            //Si el token esta entre 64500 y 66700
            if (token >= 64500 && token <= 66700) {
                break; //Rompemos el bucle
            }
            
            //Vemos que tokens son menores de 1000 (denied)
            if (token <= 1000) {
                deniedTokens++;
                if (denied.equals("")) {
                    denied = token + "";
                } else {
                    denied = denied + ", " + token;
                }
            //Vemos que tokens son menores de 100000 (smaller)
            } else if (token < 100000) {
                smallTokens++;
                if (smaller.equals("")) {
                    smaller = token + "";
                } else {
                    smaller = smaller + ", " + token;
                }
            //Vemos que tokens son mayores de 100000 (bigger)
            } else if (token >= 100000) {
                biggerTokens++;
                if (bigger.equals("")) {
                    bigger = token + "";
                } else {
                    bigger = bigger + ", " + token;
                }
            }
        }
        
        //Imprimimos resultados
        System.out.printf("%n");
        System.out.println("Analysis statistics:");
        
        //Imprimimos cual fue el token bque rompio el codigo
        System.out.println("AI ALERT! Suspicious token detected: " + token);
        
        //Imprimimos los tokens pequeños
        if (smallTokens == 0) {
            System.out.println("Tokens smaller than 100000: 0");
        } else {
            System.out.println("Tokens smaller than 100000: " + smallTokens + " (" + smaller + ")");
        }
        
        //Imprimimos los tokens grandes
        if (biggerTokens == 0) {
            System.out.println("Tokens bigger or equal than 100000: 0");
        } else {
            System.out.println("Tokens bigger or equal than 100000: " + biggerTokens + " (" + bigger + ")");
        }
        
        //Imprimimos los tokens rechazados
        if (deniedTokens == 0) {
            System.out.println("Rejected tokens: 0");
        } else {
            System.out.println("Rejected tokens: " + deniedTokens + " (" + denied + ")");
        }
    }
}