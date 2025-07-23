package NestedLoops;
import java.util.Scanner;

public class InvertedStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numner of rows:");
        int n = sc.nextInt();
        sc.close();
        // Outer loop for each row
    //   for(int i = n; i >= 1; i--) {
    //         // Inner loop for printing stars
    //         for(int j = 1; j <= i; j++) {
    //             System.out.print("* ");
    //         }
        for(int i=1; i <=n;i++){
            for(int j =1;j<=n-i+1;j++){//start<= n - line +1
                System.out.print("* ");
            }
        }
            System.out.println(); // Move to the next line after each row
        }
    
}

