package LinkedList;

import java.util.Scanner;

public class LLCreation {

    //Node class
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next= null;
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        LLCreation ll = new LLCreation();
        Node head = null;
        Node tail = null;
        System.out.println("Enter the number of nodes you want to create:");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Enter the data for node " + (i+1) + ":");
            int data = sc.nextInt();
            Node newNode = ll.new Node(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        System.out.println("Linked List created successfully.");
        System.out.print("Linked List: ");
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
        sc.close();
    }
    }

