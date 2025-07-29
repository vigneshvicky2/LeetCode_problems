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
class Solution {
    // TreeNode ans = null;
    public TreeNode searchBST(TreeNode root, int val) {
        
        return rec(root,val);
    }
    TreeNode rec(TreeNode root , int val){
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }
        else if(root.val>val){
            return  rec(root.left,val);
            
        }
        else return rec(root.right,val);
    }
}