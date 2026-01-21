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
public class Total_nodes {
    public static void main(String[] args) {
        System.out.println("Total nodes in the tree: ");
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(7);
        int total = total_nodes(root);
        System.out.println(total);
    };
    public static int total_nodes(TreeNode root){
        if (root == null){
            return 0;
        }
        return 1 + total_nodes(root.left) + total_nodes(root.right);
    }
}
