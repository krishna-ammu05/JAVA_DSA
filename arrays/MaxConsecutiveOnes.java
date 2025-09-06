package arrays;
import java.util.Scanner;
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array (0s and 1s):");
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        int result = findMaxConsecutiveOnes(arr);
        System.out.println("Maximum number of consecutive 1s: " + result);
        sc.close();
    }

    public static int findMaxConsecutiveOnes(int[] arr){
        int maxCount =0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                maxCount = Math.max(count,maxCount);
            }else{
                count =0;
            }
        }
        return maxCount;
    }
}
