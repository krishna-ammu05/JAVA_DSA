package LinkedList;
import java.util.Scanner;
public class PalindromeLL{
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
    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
    boolean isPalindrome() {
        if (head == null || head.next == null) return true;

        Node slow = head;
        Node fast = head;

        // Find the middle of the list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the list
        Node reversedSecondHalf = reverse(slow);
        Node firstHalf = head;

        // Compare both halves
        Node currentReversed = reversedSecondHalf;
        while (currentReversed != null) {
            if (firstHalf.data != currentReversed.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            currentReversed = currentReversed.next;
        }

        return true;
    }
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        PalindromeLL list = new PalindromeLL();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers to add to the list (type 'done' to finish):");
        
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int data = scanner.nextInt();
                list.addLast(data);
            } else if (scanner.next().equalsIgnoreCase("done")) {
                break;
            } else {
                System.out.println("Please enter a valid integer or 'done' to finish.");
            }
        }

        System.out.println("The linked list is:");
        list.printList();

        if (list.isPalindrome()) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
        
        scanner.close();
    }
}
