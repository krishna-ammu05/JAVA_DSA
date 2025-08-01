package Recursion;

import java.util.Scanner;
public class numsIncreasing {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        System.out.println("Increasing order from " + n + " to 1:");
        numsIncreasng(n);
        sc.close();


    }

public static void numsIncreasng(int n){
    if(n == 1){
        System.out.println(n+" ");
        return;
    }
    numsIncreasng(n - 1);
    System.out.println(n + " ");
    // System.out.println(n);
}
} 
