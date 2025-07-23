package NestedLoops;
import java.util.Scanner;

public class PrintCharacterPattern {
    public static void main(String[] args) {
        char ch = 'A';
        Scanner sc = new Scanner(System.in);  // ✅ fixed
        System.out.print("Enter the number of rows for the character pattern: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();  // Move to next line
        }
    }
}
