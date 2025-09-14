package Trees;

import java.util.Scanner;

public class Build_preOrder {
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

        public static void PreOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            PreOrder(root.left);
            PreOrder(root.right);

       }
        public static void INOrder(Node root) {
            if (root == null) return;
            INOrder(root.left);
            System.out.print(root.data + " ");
            INOrder(root.right);
        }
        public static void PostOrder(Node root) {
            if (root == null) return;
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data + " ");
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
        BinaryTree tree = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);
        System.out.println("PreOrder Traversal:");
        BinaryTree.PreOrder(root);
        System.out.println("InOrder Traversal:");
        BinaryTree.INOrder(root);
        System.out.println("PostOrder Traversal:");
        BinaryTree.PostOrder(root);
        System.out.println("\nTree Structure:");
        BinaryTree.PrintTree(root,0);
        sc.close();
    }

}
