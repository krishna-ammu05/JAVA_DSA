//package Arraylist;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class pairSumTwoptr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("enter no. of elements:");
        int n = sc.nextInt();
        System.out.println("enter the elements:");
        for(int i =0;i<n;i++){
            arr.add(sc.nextInt());
        } 
        System.out.println("enter the target sum:");
        int target = sc.nextInt();

        ArrayList<int[]> TwoPtrPairs = pairSumTwoPointer(arr,target);
        System.out.println("Pairs with the target sum:");
        printPairs(TwoPtrPairs);
    }

    public static void printPairs(ArrayList<int[]> pairs){
        if(pairs.isEmpty()){
            System.out.println("No pairs found");
        } else{
            for(int[] pair:pairs){
                System.out.println("Pair: " + pair[0] + ", " + pair[1]);
            }
        }       
    }
    public static ArrayList<int[]> pairSumTwoPointer(ArrayList<Integer> arr,int target){
        ArrayList<int[]> pairs = new ArrayList<>();
        //sort the RR
        Collections.sort(arr);
        int left = 0;
        int right = arr.size()-1;
        while (left < right){
            int sum = arr.get(left) + arr.get(right);
            if(sum == target){
                pairs.add(new int[]{arr.get(left), arr.get(right)});
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
       }
       return pairs;
    }
}