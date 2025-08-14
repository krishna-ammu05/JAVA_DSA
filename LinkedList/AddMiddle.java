package LinkedList;

public class AddMiddle {
    
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

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // 🔹 Add element at a given index (middle)
    public void addMiddle(int index, int data) {
        if (index == 0) { // Insert at beginning
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int count = 0;

        // Traverse to (index - 1)th node
        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Index out of bounds!");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        // If added at the end, update tail
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    // Display method
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        AddMiddle ll = new AddMiddle();

        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.display(); // 30 -> 20 -> 10 -> null
        ll.addLast(50);
        ll.addLast(60);
        ll.display();
        ll.display(); // 30 -> 20 -> 10 -> 50 -> 60 -> null

        ll.addMiddle(3, 40); // Insert 40 at index 3
        ll.display(); // 30 -> 20 -> 10 -> 40 -> 50 -> 60 -> null
    }
}
