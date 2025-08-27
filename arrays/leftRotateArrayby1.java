package arrays;

import java.util.Scanner;

public class leftRotateArrayby1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int[] results = leftRotateArray(arr);
        // System.out.println(results);
    }

    public static int[] leftRotateArray(int[] arr){
        int temp =arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1]=temp;
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
       return arr;
    }
  
}
