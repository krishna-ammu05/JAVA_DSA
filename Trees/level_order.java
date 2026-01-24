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
public class level_order {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
    
        System.out.println("Level order Traversal:");
        levelorder_traversal(root);
    }
    public static void levelorder_traversal(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        // q.add(null);
        while(!q.isEmpty()){
           TreeNode curr =  q.poll();
           System.out.print(curr.data + " ");
           if(curr.left != null){
            q.add(curr.left);
           }
           if(curr.right != null){
            q.add(curr.right);
           }
        }
    }
}
