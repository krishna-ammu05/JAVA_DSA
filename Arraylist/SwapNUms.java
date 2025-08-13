package Arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SwapNUms {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter index 1 to swap");
        int idx1 = sc.nextInt();
        System.out.println("enter index 2 to swap");
        int idx2 = sc.nextInt();
        System.out.println("original list"+ list);
        swap(list,idx1,idx2);
        System.out.println("list after swapping numbers" +list );

    }

    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
}
