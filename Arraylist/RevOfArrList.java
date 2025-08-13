package Arraylist;

import java.util.ArrayList;

public class RevOfArrList {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("ammu");
        list.add("abhi");
        list.add("gundu");
        list.add("laddu");
        list.add("krishna");

        for (int i= list.size()-1; i>=0;i--){
            System.out.println(list.get(i) +" ");
        }
        System.out.println();

    }
}
