package LinkedList;

import java.util.Scanner;

public class IterativeSearch {

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

    // Iterative search method
    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false; // If not found
    }

    public static void main(String[] args) {
        IterativeSearch list = new IterativeSearch();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }

        System.out.print("Enter value to search: ");
        int key = sc.nextInt();

        if (list.search(key)) {
            System.out.println(key + " is found in the Linked List.");
        } else {
            System.out.println(key + " is NOT found in the Linked List.");
        }

        sc.close();
    }
}
