package Recursion;
import java.util.Scanner;
public class XpowerNOpt {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number:");
        int x = sc.nextInt();
        System.out.println("Enter the exponent:");
        int n = sc.nextInt();
        sc.close();
        long result = power(x, n);
        System.out.println(x + "^" + n + " = " + result);
    }

    public static long power(int x, int n) {
        // Base case
        if (n == 0)
            return 1;

        // Recursive call
        long halfPower = power(x, n / 2);

        // If power is even
        if (n % 2 == 0)
            return halfPower * halfPower;
        else
            return x * halfPower * halfPower;
    }
}


