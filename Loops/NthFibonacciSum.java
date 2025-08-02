package Loops;
import java.util.Scanner;
public class NthFibonacciSum {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci series:");
        int n = sc.nextInt();
        sc.close();
        int a = 0, b = 1, sum = a + b;

        for (int i = 2; i < n; i++) {
            int c = a + b;
            sum += c;
            a = b;
            b = c;
        }
        System.out.println("Sum of first " + n + " Fibonacci numbers: " + sum);
    }
}


