package LinkedList;

import java.util.Scanner;

public class RemoveFirst {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size = 0;
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        }
       
        //Remove First Eleement
        public void removeFirst(){
            if(head == null){
                System.out.println("list is empty");
                return;
            }
            if(head == tail){
                head = tail = null;
        }
            else{
                head = head.next;
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
        RemoveFirst ll = new RemoveFirst();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            ll.addLast(sc.nextInt());
        }

        System.out.println("\nOriginal Linked List:");
        ll.printList();
        System.out.println("Size: " + ll.getSize());

        System.out.println("\nRemoving first element...");
        ll.removeFirst();

        System.out.println("\nUpdated Linked List:");
        ll.printList();
        System.out.println("Size: " + ll.getSize());

        sc.close();
    }

    }
    

