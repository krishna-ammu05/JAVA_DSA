package Functions;
import java.util.Scanner;

public class PrimeNum {

    // Function to check if number is prime
        public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        sc.close();

        if (isPrime(num))
            System.out.println(num + " is a Prime Number.");
        else
            System.out.println(num + " is NOT a Prime Number.");
    }
}
