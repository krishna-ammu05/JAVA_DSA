package NestedLoops;
import java.util.Scanner;

public class PrintStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // ✅ fixed
        System.out.print("Enter the number of rows for the star pattern: ");
        int n = sc.nextInt();
        sc.close();
        
        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
