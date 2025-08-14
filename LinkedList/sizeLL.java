package LinkedList;
import java.util.Scanner;
public class sizeLL {

    // Node class
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head, tail, and size
    public static Node head;
    public static Node tail;
    public static int size = 0; // keeps track dynamically

    // Add element at end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++; // update size
    }

    // Print list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Get size
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        sizeLL ll = new sizeLL();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            ll.addLast(sc.nextInt());
        }

        System.out.println("\nLinked List:");
        ll.printList();
        System.out.println("Size of Linked List: " + ll.getSize());

        sc.close();
    }
}


