/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;
class binaryTree_Preorder {
    List<Integer> preorder; 
    binaryTree_Preorder(){
        this.preorder = new ArrayList<>();
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return null;
        }
        //List<Integer> preorder = new ArrayList<>();
        preorder.add(root.val);
        if(root.left == null){
            preorder.add(root.val);
        } else {
            preorderTraversal(root.left);
        }
        if(root.right == null){
            preorder.add(root.val);
        } else {
            preorderTraversal(root.right);
        }
        return preorder;
    }

}