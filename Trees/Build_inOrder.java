package Trees;
import java.util.Scanner;
import java.util.HashMap;

public class Build_inOrder {

    public static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    public static class BinaryTree {
        static int preIndex = 0;

        // Build tree from Preorder and Inorder
        public static Node buildTree(int[] inorder, int[] preorder, int inStart, int inEnd, HashMap<Integer, Integer> inMap) {
            if (inStart > inEnd) return null;

            // Pick current node from preorder
            int rootVal = preorder[preIndex++];
            Node root = new Node(rootVal);

            // Find index of this node in inorder array
            int inIndex = inMap.get(rootVal);

            // Build left and right subtrees
            root.left = buildTree(inorder, preorder, inStart, inIndex - 1, inMap);
            root.right = buildTree(inorder, preorder, inIndex + 1, inEnd, inMap);

            return root;
        }

        // Inorder traversal
        public static void INOrder(Node root) {
            if (root == null) return;
            INOrder(root.left);
            System.out.print(root.data + " ");
            INOrder(root.right);
        }

        // Preorder traversal
        public static void PreOrder(Node root) {
            if (root == null) return;
            System.out.print(root.data + " ");
            PreOrder(root.left);
            PreOrder(root.right);
        }

        // Print tree visually
        public static void PrintTree(Node root, int space) {
            if (root == null) return;
            int COUNT = 5;
            space += COUNT;
            PrintTree(root.right, space);
            System.out.println();
            for (int i = COUNT; i < space; i++) System.out.print(" ");
            System.out.println(root.data);
            PrintTree(root.left, space);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();

        int[] inorder = new int[n];
        int[] preorder = new int[n];

        System.out.println("Enter INORDER array:");
        for (int i = 0; i < n; i++) inorder[i] = sc.nextInt();

        System.out.println("Enter PREORDER array:");
        for (int i = 0; i < n; i++) preorder[i] = sc.nextInt();

        // Map to quickly find index of a value in inorder
        HashMap<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0; i < n; i++) inMap.put(inorder[i], i);

        BinaryTree.preIndex = 0;
        Node root = BinaryTree.buildTree(inorder, preorder, 0, n - 1, inMap);

        System.out.println("\nPreOrder Traversal:");
        BinaryTree.PreOrder(root);

        System.out.println("\nINOrder Traversal:");
        BinaryTree.INOrder(root);

        System.out.println("\nTree Structure:");
        BinaryTree.PrintTree(root, 0);

        sc.close();
    }
}
