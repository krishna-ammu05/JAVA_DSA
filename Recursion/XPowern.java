package Recursion;
import java.util.Scanner;
public class XPowern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number:");
        int base = sc.nextInt();
        System.out.println("Enter the exponent:");
        int exponent = sc.nextInt();
        sc.close();
        
        long result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
    public static long power(int base,int exponent){
        if(exponent ==0){
            return 1;
        }
        if(exponent < 0){
            return 1 / power(base, -exponent);
        }
        return base * power( base,exponent-1);
    }
}
