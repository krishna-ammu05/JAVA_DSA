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
public class BST {
    public static void main(String[] args) {
    TreeNode root = null;

    root = insert(root, 10);
    root = insert(root, 5);
    root = insert(root, 15);
    root = insert(root, 3);
    root = insert(root, 7);
    root = insert(root, 12);
    root = insert(root, 18);
    System.out.print("Inorder: ");
    inorder(root);

}
    public static TreeNode insert(TreeNode root ,int data){
        if(root == null){
            return new TreeNode(data);
        }
        if(data < root.data){
            root.left = insert(root.left ,data);
            return root;
        }
        else{
            root.right = insert(root.right,data);
            return root;
        }
    }
    public static void inorder(TreeNode root){
        if(root != null){
            inorder(root.left);
            System.out.println( root.data + " ");
            inorder(root.right);
        }
    }
}
