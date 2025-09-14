package Trees;
import java.util.Scanner;
import java.util.Queue;
import java.util.*;
public class LevelOrder {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree{
        static int index =0;//tracks array

        public static Node buildTree(int[] nodes){
            if(index >= nodes.length || nodes[index] == -1){
                index++;
                return null;
            }
            Node newNode = new Node(nodes[index++]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        public static void LevelOrder(Node root){
            if(root == null) return;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }

        }

       public static void PrintTree(Node root,int space){
        if(root == null){
            return;
        }
        int COUNT =5;
        space +=COUNT;
        PrintTree(root.right,space);
        System.out.println();
        for(int i=COUNT;i<space;i++){
            System.out.print(" ");
        
        }
        System.out.println(root.data);
        PrintTree(root.left,space);
       }
      

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        int n = sc.nextInt();
        int[] nodes = new int[n];
        System.out.println("Enter the node values in preOrder (-1 for null):");
        for(int i=0;i<n;i++){
            nodes[i] = sc.nextInt();
        }
       // BinaryTree tree = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);
        System.out.println("Level Order Traversal:");
        BinaryTree.LevelOrder(root);
        System.out.println("\nTree Structure:");
        BinaryTree.PrintTree(root,0);
        sc.close();
    }

}

//         1
//       /   \
//      2     3
//     / \   /
//    4   5 6
// Input: 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 -1
 
// Queue process:

// 1.Queue: [1, null] → print 1, add 2 & 3 → [null, 2, 3]
// 2.Remove null → print newline → queue: [2, 3, null]
// 3.Process 2 → print 2, add 4 & 5 → [3, null, 4, 5]
// 4.Process 3 → print 3, add 6 → [null, 4, 5, 6]
// 5.Remove null → print newline → queue: [4, 5, 6, null]
// 6.Continue until queue is empty → done.


// Output:
// 1
// 2 3
// 4 5 6
