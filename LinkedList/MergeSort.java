package LinkedList;
class MergeSort {
    // Node class
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Function to print the linked list
    public void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    // Function to add node at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    // Function to perform merge sort
    public Node mergeSort(Node h) {
        // Base case: if head is null or has only one node
        if (h == null || h.next == null)
            return h;

        // Step 1: Split list into two halves
        Node middle = getMiddle(h);
        Node nextOfMiddle = middle.next;

        middle.next = null; // break into two lists

        // Step 2: Apply mergeSort on left and right halves
        Node left = mergeSort(h);
        Node right = mergeSort(nextOfMiddle);

        // Step 3: Merge the sorted halves
        Node sortedList = sortedMerge(left, right);
        return sortedList;
    }

    // Utility function to merge two sorted linked lists
    public Node sortedMerge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        Node result;
        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    // Utility function to get the middle of the linked list
    public Node getMiddle(Node h) {
        if (h == null) return h;

        Node slow = h, fast = h;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Driver code
    public static void main(String[] args) {
        MergeSort list = new MergeSort();
        list.insert(10);
        list.insert(3);
        list.insert(5);
        list.insert(2);
        list.insert(8);

        System.out.println("Original Linked List:");
        list.printList(list.head);

        list.head = list.mergeSort(list.head);

        System.out.println("Sorted Linked List:");
        list.printList(list.head);
    }
}
