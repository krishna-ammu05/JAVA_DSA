package Loops;
import java.util.Scanner;
public class IsFibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a Fibonacci number:");
        int num = sc.nextInt();
        sc.close();
        if (isFibonacci(num)) {
            System.out.println(num + " is a Fibonacci number.");
        } else {
            System.out.println(num + " is not a Fibonacci number.");
        }
    }

public static boolean isFibonacci(int n) {
        int a = 0, b = 1, c = 0;
        if (n == a || n == b) {
            return true;
        }
        while (c < n) {
            c = a + b;
            a = b;
            b = c;
        }
        return c == n;
    }
}