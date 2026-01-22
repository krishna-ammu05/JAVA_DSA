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
public class Diameter {
    // class Info{
    //     int diameter;
    // }
    static int diameter =0;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(7);
        root.right.right = new TreeNode(15);

        height(root);//compute height and update diameter
        System.out.println("Diameter of the tree: " + diameter);
    }   
    public static int height(TreeNode root){
            if(root == null) return 0;
            int leftH = height(root.left);
            int rightH = height(root.right);
            diameter = Math.max(diameter ,leftH + rightH +1);
            return Math.max(leftH,rightH)+1;
        }

    }