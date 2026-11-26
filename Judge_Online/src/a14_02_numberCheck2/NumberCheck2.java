package a14_02_numberCheck2;
import java.util.Scanner;
public class NumberCheck2{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();

        printMessage("NUMBER ANALYSIS PROGRAM");
        printNumber(number);
        checkEvenOdd(number);
        checkSign(number);
        checkDigits(number);
        checkPrime(number);
        printMessage("END OF PROGRAM");

        scanner.close();
    }

    public static void printMessage(String text) {
        System.out.println(text);
    }

    public static void printNumber(int number) {
        System.out.println("Number: " + number);
    }

    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

    public static void checkSign(int number) {
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else if (number == 0) {
            System.out.println("The number is zero");
        }
    }

    public static void checkDigits(int number) {
        String numberStr = String.valueOf(Math.abs(number));
        int largo = numberStr.length();
        
        if (largo == 1) {
            System.out.println("The number has 1 digit");
        } else {
            System.out.println("The number has " + largo + " digits");
        }
    }

    public static void checkPrime(int number) {
        int contadorDivisores = 0;
        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                contadorDivisores++;
            }
        }
        
        if (contadorDivisores == 2) {
            System.out.println("The number is a Prime number");
        } else {
            System.out.println("The number is not a Prime number");
        }
    }

}