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
iport java.util.*;
class binaryTre_Postorder {
    public List<Integer> postorderTraversal(TreeNode root) {
       List<Integer> postorder_list =new ArrayList<>();
        postorder(root,postorder_list);
        return postorder_list;
        
    }
    private void postorder(TreeNode root,List<Integer> postorder_list){
        if(root == null) return;
        postorder(root.left,postorder_list);  
        postorder(root.right,postorder_list);
        postorder_list.add(root.val);
    }
}