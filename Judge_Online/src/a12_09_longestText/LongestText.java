package a12_09_longestText;
import java.util.Scanner;

public class LongestText {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //Variables
        String text = "";
        String mayor = "";

        while (!text.equalsIgnoreCase("end")) {
            System.out.println("Enter a text (END to finish): ");
            text = scanner.nextLine();

            if (!text.equalsIgnoreCase("end") && text.length() > mayor.length()) {
                mayor = text;
            }
        }

        if (mayor.isEmpty()) {
            System.out.println("Text not entered");
        } else {
            System.out.println("Longest text length: " + mayor.length());
            System.out.println("Text: " + mayor);
        }
    }
}