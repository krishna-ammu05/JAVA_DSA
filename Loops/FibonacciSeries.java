package Loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci series:");
        int n = sc.nextInt();
        int f1 = 0, f2 = 1, f3;
        sc.close();
        System.out.print("Fibonacci Series: " + f1 + " " + f2);
        for(int i = 2; i < n; i++) {
            f3 = f1 + f2;
            System.out.print(" " + f3);
            f1 = f2;
            f2 = f3;
        }
    }
}
