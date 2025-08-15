package LinkedList;

import java.util.Scanner;

public class RemoveMiddle {
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
    ///Remov eiddle element in LL
    
    public void RemoveMiddle(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(size == 1){
            head = tail = null;
            size--;
            return;

        }
        int midIndex = size / 2; // middle index
        Node current = head;

        // move to the node before the middle
        for (int i = 0; i < midIndex - 1; i++) {
            current = current.next;
        }

        Node middleNode = current.next; // middle node
        current.next = middleNode.next; // bypass middle node

        if (middleNode == tail) {
            tail = current;
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
    public int getSize() {
        return size;
    }
    public static void main(String[] args) {
        RemoveMiddle list = new RemoveMiddle();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.addLast(sc.nextInt());
        }

        System.out.println("\nLinked List:");
        list.printList();
        
        System.out.println("Original List:");
        list.printList();
        
        list.RemoveMiddle();
        
        System.out.println("List after removing middle element:");
        list.printList();
    }
}
