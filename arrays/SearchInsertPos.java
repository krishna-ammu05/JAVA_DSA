package arrays;

import java.util.Scanner;

public class SearchInsertPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("enter elements in sorted order");
        for(int i=0;i<size ;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("enter target");
        int target =sc.nextInt();
        int results = searchInsert(nums,target);
        System.out.println("Enter index"+" "+results);
    }
    public static int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
         return nums.length;
    }
}
