package Recursion;
import java.util.Scanner;
public class TilingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the floor (n):");
        int n = sc.nextInt();
        sc.close();
        int ways = countWays(n);
        System.out.println("Number of ways to tile 2 x " + n + " floor: " + ways);
    }

    public static int countWays(int n) {
        // Base cases
        if (n == 0 || n == 1)
            return 1;

        // Recursive calls
        return countWays(n - 1) + countWays(n - 2);
    }
}


