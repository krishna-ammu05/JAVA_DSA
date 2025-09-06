package arrays;
import java.util.Scanner;
public class SortColors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input size
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        // Input elements (0,1,2 only)
        System.out.println("Enter the elements (only 0, 1, 2): ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // Sort colors
        sortColors(nums);
        // Print result
        System.out.println("Sorted array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        sc.close();
    }
    
    public static void sortColors(int[] nums){
        int low =0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp = nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
}