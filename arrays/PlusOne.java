package arrays;
import java.util.Scanner;
import java.util.Arrays;
public class PlusOne{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of the array");
        int n = sc.nextInt();
        System.out.println("enter elements");
        int[] arr = new int[n];
        for (int i =0; i<n ;i++){
           arr[i]= sc.nextInt();
        }
        
        int[] results = plusOne(arr);
        System.out.println(Arrays.toString(results));
    }
    public static int[] plusOne(int[] digits){
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]=digits[i]+1;
                return digits;
            }
           digits[i]=0;
        }
        int[] newNumber = new int[digits.length+1];
        newNumber[0]=1;
        return newNumber;
    }
}