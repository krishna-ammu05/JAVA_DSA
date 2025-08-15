package LinkedList;

import java.util.Scanner;

public class ReverseLL{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    static Node tail;
    public static void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail= newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }

    }
    public static void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public static void printList(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of elements in the linked list:");
        int n = sc.nextInt();
        System.out.println("enetr the lements");
        for(int i =0;i<n;i++){
            int data = sc.nextInt();
            insert(data);
        }
        System.out.println("Original Linked List:");
        printList();
        reverse();
        System.out.println("Reversed Linked List:");
        printList();
        sc.close();

    }

}