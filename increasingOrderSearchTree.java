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
class Solution {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> inorder_list = new ArrayList<>();
        inorder_list = inorder(root,inorder_list);
        System.out.println(inorder_list);
        return createRightSkewTree(inorder_list);

    }
    public List<Integer> inorder(TreeNode root, List<Integer> inorder_list){
        if(root == null) return inorder_list;
        inorder(root.left,inorder_list);
        inorder_list.add(root.val);
        inorder(root.right,inorder_list);
        return inorder_list;
    }
    public TreeNode createRightSkewTree(List<Integer> inorder_list){
        TreeNode new_root = new TreeNode(0);
        TreeNode temp = new_root;
        for(int eachVal : inorder_list){

           temp.right = new TreeNode(eachVal);
           temp.left = null;
           temp = temp.right;
            
        }
        return new_root.right;

    }
}