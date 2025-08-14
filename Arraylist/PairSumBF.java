//package Arraylist;
import java.util.Scanner;
import java.util.ArrayList;

public class PairSumBF{
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

        ArrayList<int[]> bruteForcePairs = pairSumBruteForce(arr,target);
        System.out.println("Pairs with the target sum:");
        printPairs(bruteForcePairs);
    }

    public static ArrayList<int[]> pairSumBruteForce(ArrayList<Integer> arr,int target){
        ArrayList<int[]> pairs = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++){
            for(int j = i + 1; j < arr.size(); j++){
                if(arr.get(i) + arr.get(j) == target){
                    pairs.add(new int[]{arr.get(i),arr.get(j)});
                }
            }
        }
        return pairs;
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
}