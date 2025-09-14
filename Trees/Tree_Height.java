package Trees;

public class Tree_Height {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;
        }
    }

    public static int getHeight(Node root){
        if(root == null){
            return 0;
        }
        int LeftH = getHeight(root.left);
        int rightH = getHeight(root.right);
        return Math.max(LeftH,rightH) +1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right.left = new Node(10);
        root.left.right.left.left = new Node(11);

        int height = getHeight(root);
        System.out.println("Height of the tree: " + height);
    }
}
