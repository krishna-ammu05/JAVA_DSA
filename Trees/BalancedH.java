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
public class BalancedH {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(15);

        boolean isBalanced = isBalanced(root);
        if(isBalanced)
            System.out.println("The tree is height balanced Tree");
        else
            System.out.println("The tree is not balanced tree");
        // System.out.println("Is the tree height-balanced? " + isBalanced);
    }
    static int helper(TreeNode root){
        if(root == null) return 0;
        int LH = helper(root.left);
        if(LH == -1)return -1;
        int RH = helper(root.right);
        if(RH == -1)return -1;
        if(Math.abs(LH-RH) > 1) return -1;
        return Math.max(LH,RH)+1;
    }
    static boolean isBalanced(TreeNode root){
        return helper(root) != -1;
    }
 }
