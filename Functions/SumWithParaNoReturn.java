package Functions;
import java.util.Scanner;
public class SumWithParaNoReturn {
    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum (With Parameters, No Return): " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        // sum(10, 20);
        sum(a , b);
    }
}
