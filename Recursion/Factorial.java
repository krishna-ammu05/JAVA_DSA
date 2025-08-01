package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int num = 5; // Example number
        int result = fact(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }

public static int fact(int n){
    if(n ==0 || n == 1){
        return 1;
    }
    return n * fact(n - 1);
}
}