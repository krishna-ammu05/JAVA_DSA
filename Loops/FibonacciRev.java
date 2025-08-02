package Loops;
import java.util.Scanner;
public class FibonacciRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci series:");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            printReverseFibonacci(n);
        }
        sc.close();
    }

    public static void printReverseFibonacci(int n) {
        int[] fibSeries = new int[n];
        fibSeries[0] = 0;
        fibSeries[1] = 1;
        for (int i = 2; i < n; i++) {
            fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
        }
        System.out.print("Fibonacci Series in reverse: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(fibSeries[i] + " ");
        }
    }
}