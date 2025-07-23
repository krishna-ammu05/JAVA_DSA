package Functions;

import java.util.Scanner;

public class SumNoParaWithReturn {
    public static int sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a + b;
    }

    public static void main(String[] args) {
        int result = sum();
        System.out.println("Sum (No Parameters, With Return): " + result);
    }
}
