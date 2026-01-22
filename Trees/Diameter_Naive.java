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
public class Diameter_Naive {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(7);
        root.right.right = new TreeNode(15);

        int diameter = diameter(root);
        System.out.println("Diameter of the tree: " + diameter);
    }
    static int height(TreeNode root){
        if(root == null) return 0;
        int LH = height(root.left);
        int RH = height(root.right);
        return Math.max(LH,RH)+ 1;
    }
    static int diameter(TreeNode root){
        if(root ==  null)return 0;

        int LH = height(root.left);
        int RH = height(root.right);
        int throughroot =LH+RH;        int LD= diameter(root.left);
        int RD= diameter(root.right);
        return Math.max(throughroot,Math.max(LD,RD));

    }
}
