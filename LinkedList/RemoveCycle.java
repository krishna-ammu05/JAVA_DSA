package LinkedList;

import java.util.Scanner;

public class RemoveCycle {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void createCycle(int pos){
        if(head == null|| pos<=0) return;
        Node temp = head,cycleNode = null;
        int count =1;
        while(temp.next!=null){
            if(count == pos){
                cycleNode = temp;
            }
            temp= temp.next;
            count++;
        }
        temp.next = cycleNode;
    }

    public Node detectCycle(){
        Node slow = head,fast = head;
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return slow;//meeting point
            }
        }
        return null;
    }

    public void removeCycle(){
        Node meet = detectCycle();
        if(meet == null) return;
        Node start = head;
        while(start!= meet){
            start = start.next;
            meet = meet.next;
        }
        Node ptr = start;
        while(ptr.next != start){
            ptr=ptr.next;
        }
        ptr.next = null;
    }
     public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner((System.in));
        RemoveCycle list = new RemoveCycle();
        System.out.println("Enter no. of nodes:");
        int n = sc.nextInt();
        System.out.println("enter elements");
        for(int i =0;i<n;i++){
            list.insert(sc.nextInt());
        }
        System.out.println("Enter position to create cycle(0for none)");
        int pos = sc.nextInt();
        if(pos>0){
            list.createCycle(pos);
        }
        list.printList();

        if (list.detectCycle() != null) {
            System.out.println("Cycle detected ");
            list.removeCycle();
            System.out.println("Cycle removed ");
        } else {
            System.out.println("No cycle ");
        }
        System.out.println("Final Linked list");
        list.printList();
        sc.close();
    }
} 

