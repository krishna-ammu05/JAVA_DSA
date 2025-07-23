package Functions;
import java.util.Scanner;
public class Factorial {
    

    // Function to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int num = sc.nextInt();
        sc.close();

        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
