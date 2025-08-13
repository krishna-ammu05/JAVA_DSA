#  ArrayList in Java

##  Overview
`ArrayList` is a **resizable array** implementation of the `List` interface in Java's **Collections Framework**.  
It behaves like a dynamic array that automatically grows and shrinks as elements are added or removed.

---

##  Declaration & Syntax
```java
import java.util.ArrayList;

// Generic Syntax
ArrayList<Type> listName = new ArrayList<>();

// Example
ArrayList<String> names = new ArrayList<>();
ArrayList<Integer> numbers = new ArrayList<>();
```

- **`Type`**: The data type of elements (`String`, `Integer`, `Double`, custom class, etc.)
- **Diamond Operator (`<>`)**: Lets the compiler infer the type (Java 7+).

---

##  Basic Example
```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // 1️ Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // 2️ Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // 3️ Access elements
        System.out.println("First fruit: " + fruits.get(0));

        // 4️ Update an element
        fruits.set(1, "Blueberry");

        // 5️ Remove elements
        fruits.remove(2); // by index
        fruits.remove("Apple"); // by value

        // 6️ Loop through elements
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 7️ Size of ArrayList
        System.out.println("Total fruits: " + fruits.size());
    }
}
```

**Output:**
```
First fruit: Apple
Blueberry
Total fruits: 1
```

---

##  Common Methods

| Method                              | Description |
|-------------------------------------|-------------|
| `add(E e)`                          | Appends element to the end |
| `add(int index, E e)`               | Inserts element at given index |
| `get(int index)`                    | Retrieves element at index |
| `set(int index, E e)`               | Updates element at index |
| `remove(int index)`                 | Removes element at index |
| `remove(Object o)`                  | Removes first occurrence of object |
| `contains(Object o)`                | Checks if element exists |
| `size()`                            | Returns number of elements |
| `clear()`                           | Removes all elements |
| `isEmpty()`                         | Checks if ArrayList is empty |
| `indexOf(Object o)`                 | Returns index of first occurrence |
| `lastIndexOf(Object o)`             | Returns index of last occurrence |

---

##  Internal Working
- Backed by a **regular array** internally.
- **Default capacity**: 10 elements.
- **Dynamic resizing**:
  1. When the internal array is full, a new array (about 1.5× larger) is created.
  2. Existing elements are copied into the new array.
- Resizing is **automatic**, but frequent resizing can reduce performance.  
  You can set **initial capacity**:
```java
ArrayList<Integer> list = new ArrayList<>(100); // Initial capacity of 100
```

---

##  Advantages
- Dynamic resizing (no manual array size management).
- Maintains **insertion order**.
- Allows **duplicate elements**.
- Rich set of built-in methods.
- Easy to iterate.

##  Disadvantages
- Slower **insertions/removals** in the middle (due to shifting elements).
- Consumes more memory than plain arrays.
- **Not synchronized** (use `Collections.synchronizedList()` for thread safety).

---

##  Converting Between Array & ArrayList

### Array → ArrayList
```java
String[] array = {"A", "B", "C"};
ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
```

### ArrayList → Array
```java
ArrayList<String> list = new ArrayList<>();
list.add("X");
list.add("Y");
String[] array = list.toArray(new String[0]);
```

---
#  Difference Between Array and ArrayList in Java

| No. | Feature | Array | ArrayList |
|-----|---------|-------|-----------|
| 1   | **Size** | Fixed size (must be known at creation time). | Dynamic size (grows or shrinks automatically). |
| 2   | **Type** | Can store both primitive types (`int`, `char`, etc.) and objects. | Stores **only objects** (wrapper classes for primitives, e.g., `Integer` for `int`). |
| 3   | **Memory Allocation** | Contiguous memory block of fixed length. | Uses a dynamic array internally, resizes when needed. |
| 4   | **Performance** | Faster for fixed-size data; no resizing overhead. | Slower in some cases due to resizing and boxing/unboxing of primitives. |
| 5   | **Flexibility** | Cannot change size once created. | Can add/remove elements anytime. |
| 6   | **Methods Available** | No built-in methods for insert, delete, search (manual code needed). | Provides many built-in methods like `add()`, `remove()`, `contains()`, `size()`. |
| 7   | **Iteration** | Can use `for` loop or `for-each` loop. | Can use `for`, `for-each`, `Iterator`, `ListIterator`, streams. |
| 8   | **Type Safety** | Can store only one data type (e.g., all `int` or all `String`). | Type-safe using generics (`ArrayList<String>`), but can store mixed types if generics are not used. |
| 9   | **Memory Usage** | Less memory (no extra capacity). | More memory due to extra capacity and object wrappers. |
| 10  | **Thread Safety** | Not synchronized by default. | Not synchronized by default, but can be made synchronized using `Collections.synchronizedList()`. |

---

##  Making ArrayList Thread-Safe
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

List<String> syncList = Collections.synchronizedList(new ArrayList<>());
```

---

##  Performance Complexity

| Operation          | Time Complexity |
|--------------------|-----------------|
| `add()` (amortized)| **O(1)**        |
| `get()`            | **O(1)**        |
| `set()`            | **O(1)**        |
| `remove()` (index) | **O(n)**        |
| `contains()`       | **O(n)**        |

---

##  Related Classes
- **`LinkedList`** → better for frequent insertions/removals.
- **`Vector`** → synchronized version of ArrayList.
- **`CopyOnWriteArrayList`** → thread-safe for concurrent reads.

---

##  References
- [Java Docs - ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)

---
