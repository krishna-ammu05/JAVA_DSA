package LinkedList;
import java.util.LinkedList;
public class JavaCollections {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        //add
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        //add first
        list.addFirst(5);
        System.out.println(list);
        //add middle
        // list.
        System.out.println(list);
        //remove First
        list.removeFirst();
        System.out.println(list);
        //remove Last
        list.removeLast();
        System.out.println(list);
        //Remove middle with index
        list.remove(1);
        System.out.println(list);
    }
}
