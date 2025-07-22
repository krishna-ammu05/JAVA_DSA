package Loops;
public class Reverse {
    //Reverse of a number
    public static void main(String[] args) {
        int number = 12345; // Number to be reversed
        int rev= 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            rev = rev * 10 + digit; // Build the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        System.out.println("Reversed Number: " + rev);
    }
    
}
