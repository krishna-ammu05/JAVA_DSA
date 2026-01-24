package Trees;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class zigzag_order {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(15);
    
        System.out.println("Zigzag order Traversal:");
        zigzagorder_traversal(root);
    }
    public static void zigzagorder_traversal(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;
        while(!q.isEmpty()){
            int size = q.size();
            int[] arr = new int[size];//can also use Arraylist
            for(int i =0;i<size;i++){
                TreeNode curr = q.poll();
                if(leftToRight){
                    arr[i] = curr.data;
                }else{
                    arr[size - i -1]= curr.data;
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            leftToRight = !leftToRight;
            for(int val :arr){
                System.out.print(" "+val);
            }
            System.out.println();
        }     
    }
}
