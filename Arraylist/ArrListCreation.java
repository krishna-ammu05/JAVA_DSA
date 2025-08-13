package Arraylist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrListCreation {
    public static  void main(String args[]){
        //basic arraylist
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("apple");
        list1.add("apple");
        System.out.println("List1:"+list1);
        // arraylist with initial capacity\
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("banana");
        list2.add("banana");
        list2.add("banana");
        System.out.println("List2:"+list2);

        //arraylists from aother colection
        List<String> tempList = List.of("Red", "Green", "Blue");
        ArrayList<String> list3 = new ArrayList<>(tempList);
        System.out.println("List3: " + list3);

        //From an array
        String[] arr = {"Cat", "Dog", "Elephant"};
        ArrayList<String> list4 = new ArrayList<>(Arrays.asList(arr));
        System.out.println("List4: " + list4);
    }
 }

