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
    public TreeNode balanceBST(TreeNode root) {
        inOrder(root);
        return buildBST(ans,0 , ans.size()-1);
    }

    public TreeNode buildBST(ArrayList<Integer> ans, int start , int end) {
        if(start>end) return null;

        int mid = start+(end-start)/2;
        TreeNode root = new TreeNode(ans.get(mid));
        root.left = buildBST(ans , start , mid-1);
        root.right = buildBST(ans , mid+1 , end);
        return root;
    }

    void inOrder(TreeNode root){
        if(root==null) return;
        inOrder(root.left);
        ans.add(root.val);
        inOrder(root.right);
    }


}