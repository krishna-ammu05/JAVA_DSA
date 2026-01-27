package TwoptrApproach;
import java.util.*;
public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array");
        int n = sc.nextInt();
        System.out.println("enter elements in the array");
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(arr);
        pairSum(arr,target);
        sc.close();

    }
    public static void pairSum(int arr[], int target){
        int left =0;
        int right = arr.length-1;
        while(left <right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                System.out.println(arr[left] + "  " + arr[right]);
                left++;
                right--;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
            }
        }
    }
   
