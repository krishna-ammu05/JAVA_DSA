package Functions;
import java.util.Scanner;
public class SumWithParaWithReturn {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        // int result = sum(30, 40);
        int result = sum(a,b);
        System.out.println("Sum (With Parameters, With Return): " + result);
    }
}

