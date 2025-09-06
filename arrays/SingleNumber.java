package arrays;
import java.util.Scanner;
public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        int result = findSingleNumber(arr);
        System.out.println("The single number is: " + result);
        sc.close();
    }

    public static int findSingleNumber(int[] arr){
        int singleNumber =0;
        for(int i=0;i<arr.length;i++){
            singleNumber^=arr[i];
        }
        return singleNumber;

    }
}