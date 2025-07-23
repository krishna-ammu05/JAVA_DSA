package Functions;
import java.util.Scanner;

public class SumNoParaNoReturn {
    public static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum (No Parameters, No Return): " + sum);
        sc.close();
    }

    public static void main(String[] args) {
        sum();
    }
}
