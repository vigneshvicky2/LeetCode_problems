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
    TreeNode ans = null;
    public TreeNode searchBST(TreeNode root, int val) {
        rec(root,val);
        return ans;
    }
    void rec(TreeNode root , int val){
        if(root==null){
            return;
        }
        else if(root.val==val){
            ans = root;
            return;
        }
        else{
            if(root.val>val) rec(root.left,val);
            else rec(root.right,val);
        }
    }
}