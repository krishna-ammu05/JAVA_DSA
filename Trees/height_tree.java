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
public class height_tree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(7);
        int height = height_tree(root);
        System.out.println("Height of the tree "+height);
    }
    public static int height_tree(TreeNode root){
        if(root == null){
            return 0;
        }
        int left_height = height_tree(root.left);
        int right_height = height_tree(root.right);
        return Math.max(left_height,right_height)+1;
    }
}
