package TwoptrApproach;

import java.util.Scanner;

public class RemoveDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (sorted):");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int newLength = removeDuplicates(arr);
        System.out.println("The new length of the array after removing duplicates is: " + newLength);
        sc.close();
    }
    public static int removeDuplicates(int[] nums){
        if(nums.length ==0) return 0;
        int i =0;
        for(int j =1;j<nums.length;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
