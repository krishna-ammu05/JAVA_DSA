package LinkedList;
import java.util.Scanner;
public class RecursiveSearch {
    public class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    static Node tail;
    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    // Recursive search method
    public boolean search(Node node, int key){
        if(node == null){
            System.out.println(key + " is NOT found in the Linked List.");
            return false; // If not found
        }
        if(node.data == key){
            System.out.println(" " + key + " is found in the Linked List.");
            return true; // If found

        }
        return search(node.next, key); // Recur for the next node

    }

        
    public static void main(String[] args) {
        RecursiveSearch list = new RecursiveSearch();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }

        System.out.print("Enter value to search: ");
        int key = sc.nextInt();

        // Start the recursive search from the head
        list.search(head, key);

        sc.close();
    }
}

