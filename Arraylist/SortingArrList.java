package Arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingArrList {
     public static void main(String[] args) {
        
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Original List: " + fruits);

        // 1️⃣ Sort in ascending order (A-Z)
        Collections.sort(fruits);
        System.out.println("Ascending Order: " + fruits);

        // 2️⃣ Sort in descending order (Z-A)
        Collections.sort(fruits, Collections.reverseOrder());
        System.out.println("Descending Order: " + fruits);

        // 3️⃣ Using sort() with lambda (Java 8+)
        fruits.sort((a, b) -> a.compareTo(b)); // Ascending
        System.out.println("Ascending with sort(): " + fruits);

        fruits.sort((a, b) -> b.compareTo(a)); // Descending
        System.out.println("Descending with sort(): " + fruits);

        // 4️⃣ Sorting numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(15);
        numbers.add(8);
        numbers.add(23);

        System.out.println("\nOriginal Numbers: " + numbers);

        Collections.sort(numbers); // Ascending
        System.out.println("Numbers Ascending: " + numbers);

        numbers.sort(Comparator.reverseOrder()); // Descending
        System.out.println("Numbers Descending: " + numbers);
    }
}


