package Arraylist;

import java.util.ArrayList;

public class MaxNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(max < list.get(i)){
                max= list.get(i);
            }
            max = Math.max(max, list.get(i));
        }
        System.out.println("maximum number is " + max);

        int min = Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            if(min > list.get(i)){
                min= list.get(i);
            }
            min = Math.min(min, list.get(i));
        }
        System.out.println("minimum number is " + min);

    }
}
