//package Arraylist;

import java.util.Scanner;
import java.util.ArrayList;
public class ContainerWater {
    public static int storewater(ArrayList<Integer> height){
        int maxWater = 0;
        int left = 0;
        int right = height.size()-1;
        while (left < right) {
            int ht = Math.min(height.get(left), height.get(right));
            int width = right - left;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            // Move pointer from smaller height side
            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
    
    public static void main(String argas[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> height = new ArrayList<>();
        System.out.println("Enter the number of heights:");
        int n = sc.nextInt();
        System.out.println("Enter the heights:");
        for(int i = 0;i < n;i++){
            height.add(sc.nextInt());

        }
        System.out.println("The maximum water that can be contained is: " + storewater(height));
        sc.close();
    }
}
