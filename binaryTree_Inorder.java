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
class binaryTree_Inorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder_list =new ArrayList<>();
        return inorder(root,inorder_list);
        
    }
    List<Integer> inorder(TreeNode root,List<Integer> inorder_list){
        if(root == null) return inorder_list;
        inorder(root.left,inorder_list);
        inorder_list.add(root.val);
        inorder(root.right,inorder_list);
        return inorder_list; 
    }
}