package TwoptrApproach;
import java.util.*;
public class MoveZeroEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (sorted):");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       moveZeros(arr);
       System.out.println("Array after moving zeros to end:"+Arrays.toString(arr));
       sc.close();
    }
    public static void moveZeros(int[] nums){
        int i =0;
        for(int j =0;j<nums.length;j++){
            if(nums[j]!= 0){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j] = temp;
                i++;
            }
            
            }
        }
    }

