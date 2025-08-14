#  Linked List 

##  Definition
A **Linked List** is a linear data structure where elements (nodes) are connected using references (pointers).  
Each node contains:
- **Data**: The value stored in the node
- **Next**: A reference to the next node in the list

Unlike arrays, linked list elements are not stored in contiguous memory locations.

---

##  Basic Structure
In Java:
```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

---


##  Operations Implemented
1. Insert at beginning
2. Insert at end
3. Delete by value
4. Display list

---

##  Example Run
```
=== Linked List Menu ===
1. Insert at beginning
2. Insert at end
3. Delete by value
4. Display list
5. Exit
Enter your choice: 1
Enter value: 10
Inserted at beginning.

Enter your choice: 2
Enter value: 20
Inserted at end.

Enter your choice: 4
Linked List: 10 -> 20 -> null
```

---

##  Time Complexity
| Operation             | Complexity |
|-----------------------|------------|
| Insert at beginning   | O(1)       |
| Insert at end         | O(n)       |
| Delete by value       | O(n)       |
| Display list          | O(n)       |

---


MIT License
