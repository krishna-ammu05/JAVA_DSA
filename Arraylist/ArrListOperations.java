package Arraylist;

import java.util.ArrayList;

public class ArrListOperations {
    public static void main(String args[]) {
        // 1️ Create an ArrayList and add elements
        ArrayList<String> list = new ArrayList<>();
        list.add("apple"); // add(E e)
        list.add("banana");
        list.add("cherry");
        list.add("mango");
        System.out.println("Original List: " + list);

        // 2️ Add element at specific index
        list.add(2, "orange"); // add(int index, E e)
        System.out.println("After adding 'orange' at index 2: " + list);

        // 3️ Access element by index
        String element = list.get(2); // get(int index)
        System.out.println("Element at index 2: " + element);

        // 4️ Update element at index
        list.set(2, "grape"); // set(int index, E e)
        System.out.println("After setting index 2 to 'grape': " + list);

        // 5️ Remove element by index
        list.remove(2); // remove(int index)
        System.out.println("After removing element at index 2: " + list);

        // 6️ Remove element by value
        list.remove("apple"); // remove(Object o)
        System.out.println("After removing 'apple': " + list);

        // 7️ Check if element exists
        boolean hasBanana = list.contains("banana"); // contains(Object o)
        System.out.println("List contains 'banana'? " + hasBanana);

        // 8️ Get size of the list
        int size = list.size(); // size()
        System.out.println("Current size: " + size);

        // 9️ Get index of first occurrence
        list.add("banana"); // adding duplicate for testing
        System.out.println("List: " + list);
        int firstIndex = list.indexOf("banana"); // indexOf(Object o)
        System.out.println("First index of 'banana': " + firstIndex);

        //10  Get index of last occurrence
        int lastIndex = list.lastIndexOf("banana"); // lastIndexOf(Object o)
        System.out.println("Last index of 'banana': " + lastIndex);

        // 1️1️ Check if list is empty
        boolean empty = list.isEmpty(); // isEmpty()
        System.out.println("Is the list empty? " + empty);

        // 1️2Clear all elements
        list.clear(); // clear()
        System.out.println("List after clear(): " + list);
        System.out.println("Is the list empty now? " + list.isEmpty());
    }
}
