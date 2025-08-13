package Arraylist;
import java.util.ArrayList;
public class size_operation {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("mango");
        System.out.println("Original List: " + list);

        // Get size of the list
        int size = list.size(); // size()
        System.out.println("Current size: " + size);
        //printing ArraylIst using size
        for (int i =0;i<size;i++){
            System.out.println("Element at index " + i + ": " + list.get(i));

        }
    }
}
