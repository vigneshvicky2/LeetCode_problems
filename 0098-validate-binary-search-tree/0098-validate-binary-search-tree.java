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
     ArrayList<Integer> ans = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        inOrder(root);
        System.out.println(ans);
        for(int i =1 ; i< ans.size() ; i+=2){
            if(i+1 > ans.size()-1 && ans.get(i-1)<ans.get(i)  ){
                continue;
            }
            else if(i+1 < ans.size() && ans.get(i-1)<ans.get(i) && ans.get(i)< ans.get(i+1) ) continue;
            else return false;
        }
        return true;
    }
    void inOrder(TreeNode root){
        if(root==null) return;
        inOrder(root.left);
        ans.add(root.val);
        inOrder(root.right);
    }
}