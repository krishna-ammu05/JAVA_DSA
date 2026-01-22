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
public class right_view {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
    
        System.out.println("right view of tree:");
        rightview_traversal(root);
    }
    public static void rightview_traversal(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i =0;i<size;i++){
                TreeNode curr = q.poll();
                if(i ==size - 1){
                    System.out.println(curr.data);
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right!= null){
                    q.add(curr.right);
                }
            }
        }
    }
}
