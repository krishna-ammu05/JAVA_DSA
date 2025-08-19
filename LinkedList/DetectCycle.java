package LinkedList;
import java.util.Scanner;
public class DetectCycle{

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
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void createCycle(int pos){
        if(head == null || pos<=0 ) return;
        Node temp = head,cycleNode=null;
        int count = 1;
        while(temp.next!=null){
            if(count == pos){
                cycleNode = temp;
            }
            temp = temp.next;
            count++;
        }
        temp.next = cycleNode;
    }
    public static boolean isCycle(Node head){
        if(head == null) return false;
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner((System.in));
        DetectCycle list = new DetectCycle();
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

        if (isCycle(list.head)){
            System.err.println("cycle Detected");           
        }else{
            System.out.println("No Cycle");
        }
        sc.close();
    }
} 