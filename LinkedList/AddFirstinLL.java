package LinkedList;

public class AddFirstinLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){


        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

     public static void main(String[] args) {
        AddFirstinLL ll = new AddFirstinLL();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);

        System.out.print("Linked List after adding elements at the beginning: ");
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(); 
     }
}
 