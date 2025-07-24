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
    String temp ="";
    public int sumNumbers(TreeNode root) {
        add(root);
        return sum;
    }
    void add(TreeNode root){
        if(root==null) {   
            return;
        }
        temp+=root.val;
        if(root.left==null && root.right==null){
            // System.out.println(temp);
            sum+=Integer.parseInt(temp);
            // temp = temp.substring(0,temp.length()-1);
        }
        add(root.left);
        add(root.right);

        temp = temp.substring(0, temp.length() - 1);
    }

}