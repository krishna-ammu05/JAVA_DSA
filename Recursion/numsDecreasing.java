package Recursion;
import java.util.Scanner;
public class numsDecreasing {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        System.out.println("Decreasing order from " + n + " to 1:");
        numsDecreasng(n);
        sc.close();


    }

public static void numsDecreasng(int n){
    if(n == 0){
        return;
    }
    
    System.out.println(n);
    numsDecreasng(n - 1);
    // System.out.println(n);
}
}