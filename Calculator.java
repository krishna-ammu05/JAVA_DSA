import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // variable is 'scanner'

        int a = scanner.nextInt();                 // use 'scanner' here
        int b = scanner.nextInt();
        char operator = scanner.next().charAt(0);  // fix typo: 'next()', not 'nect()'

        switch (operator) {
            case '+':
                System.out.println("Sum: " + (a + b));
                break;
            case '-':
                System.out.println("Difference: " + (a - b));
                break;
            case '*':
                System.out.println("Product: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Division: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            case '%':
                if (b != 0) {
                    System.out.println("Modulus: " + (a % b));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }

        scanner.close(); // moved outside of switch block
    }
}
