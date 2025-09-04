package arrays;
import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array (0 to " + n + " with one missing):");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        sc.close();
        int missingNumber = findMissingNumber(arr);
        System.out.println("The missing number is: " + missingNumber);

    }

    public static int findMissingNumber(int[] arr){
        int n = arr.length;
        int total = n*(n+1)/2;
        int sum =0;
        for(int num:arr){
            sum+=num;
        }
        return total - sum;
    }

}
