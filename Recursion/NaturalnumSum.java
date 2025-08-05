package Recursion;
import java.util.Scanner;
public class NaturalnumSum {
    public static void main(String rgs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int result = sum(num);
        System.out.println("Sum of natural numbers up to " + num + " is: " + result);
        sc.close();
        
    }

public static int sum(int n){
    if(n==1){
        return 1;
    }
    return n + sum(n - 1);
}
}