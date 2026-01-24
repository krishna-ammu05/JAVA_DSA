package Trees;
class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class Tree_traversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(3);
        root.right.left = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(5);
        root.left.right.right = new TreeNode(5);
        System.out.println("Preorder Traversal:");
        preorderTraversal(root);
        System.out.println("\nInorder Traversal:");
        inorderTraversal(root);
        System.out.println("\nPostorder Traversal:");
        postorderTraversal(root);
    }
    public static void preorderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    public static void inorderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }
    public static void postorderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }
}

