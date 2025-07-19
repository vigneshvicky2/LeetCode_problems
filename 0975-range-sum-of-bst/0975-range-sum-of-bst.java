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
    int sum =0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        add(root,low,high);
        return sum;
    }

    void add(TreeNode root , int low , int high){
        if(root==null) return;
        if(root.val>=low && root.val<=high) sum+=root.val;
        add(root.left,low,high);
        add(root.right,low,high);
    }

}