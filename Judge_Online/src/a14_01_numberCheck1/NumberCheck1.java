package a14_01_numberCheck1;

public class NumberCheck1{

    public static int number = 7;

    public static void main(String[] args) {
        printTitle();
        printNumber();
        checkEvenOdd();
        checkSign();
        checkDigits();
        checkPrime();
        printEndMessage();
    }

    public static void printTitle() {
        System.out.println("NUMBER ANALYSIS PROGRAM");
    }

    public static void printNumber() {
        System.out.println("Number: " + number);
    }

    public static void checkEvenOdd() {
        if (number % 2 == 0) {
        	System.out.println("The number is even");
        } else {
        	System.out.println("The number is odd");
        }
    }

    public static void checkSign() {
        if (number > 0) {
        	System.out.println("The number is positive");
        } else if (number < 0) {
        	System.out.println("The number is negative");
        } else if (number == 0) {
        	System.out.println("The number is zero");
        }
    }

    public static void checkDigits() {
        String numeroStr = String.valueOf(Math.abs(number));
        int largo = numeroStr.length();
        
        if (largo == 1) {
        	System.out.println("The number has 1 digit");
        } else if (largo > 1) {
        	System.out.println("The number has " + largo +" digits");
        }
    }

    public static void checkPrime() {
        int contadorDivisores = 0;
        
        //Miramos si todos los numeros que van antes del numero introducido se pueden dividir por el numero introducido
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

    public static void printEndMessage() {
        System.out.println("END OF PROGRAM");
    }

}