package BitManipulation;
import java.util.Scanner;
public class EvenOdd {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        if ((n & 1) == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd");
    }
}


