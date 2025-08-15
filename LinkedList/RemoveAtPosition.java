package LinkedList;
import java.util.Scanner;

public class RemoveAtPosition {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    // Add node at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Remove element at given position (1-based index)
    public void removeAtPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (pos < 1 || pos > size) {
            System.out.println("Invalid position");
            return;
        }

        // If removing head
        if (pos == 1) {
            head = head.next;
            size--;
            if (head == null) tail = null;
            return;
        }

        // Traverse to the node before the one to be removed
        Node current = head;
        for (int i = 1; i < pos - 1; i++) {
            current = current.next;
        }

        // Remove the target node
        Node target = current.next;
        current.next = target.next;

        if (target == tail) {
            tail = current; // update tail if last node was removed
        }
        size--;
    }

    // Print list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RemoveAtPosition list = new RemoveAtPosition();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.addLast(sc.nextInt());
        }

        System.out.println("\nOriginal Linked List:");
        list.printList();

        System.out.print("Enter position to remove (1-based index): ");
        int pos = sc.nextInt();

        list.removeAtPosition(pos);

        System.out.println("List after removal:");
        list.printList();

        sc.close();
    }
}

