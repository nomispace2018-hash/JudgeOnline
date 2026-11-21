package a11_04_guessPassword;
import java.util.Scanner;

public class GuessPassword {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //Variables
        String usuari = "";
        String contrasenya = "";
        int intents = 0;
        
        //Pedimos usuario
        System.out.println("Login as:");
        usuari = scanner.nextLine();
        
        if (!usuari.equals("admin") && !usuari.equals("root")) {
            System.out.println("This user does not exist!");
        } else {
            while (true) {
                //Pedimos contraseña
                System.out.println(usuari + "@211.174.173.184's password:");
                contrasenya = scanner.nextLine();
                intents++;
                
                if (usuari.equals("admin") && contrasenya.equals("Fr34k!29$")) {
                    break;
                } else if (usuari.equals("root") && contrasenya.equals("kL?Je45op")) {
                    break;
                }
            }
            
            System.out.println("Welcome to Ubuntu 24.04.3 LTS. You have used " + intents + " attempts.");
        }
    }
}