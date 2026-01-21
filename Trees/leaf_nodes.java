package Trees;
class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int data){
            this.data =  data;
            this.left = null;
            this.right = null;
        }
    }
public class leaf_nodes {
    public static void main(String[] args) {
        System.out.println("Total leaf nodes in the tree: ");
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(7);
        int leafnodes = leafnodes(root);
        System.out.println("leaf nodes:"+leafnodes);
    };
    public static int leafnodes(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left ==null && root.right == null){
            return 1;
    }
    return leafnodes(root.left)+leafnodes(root.right);
}
}