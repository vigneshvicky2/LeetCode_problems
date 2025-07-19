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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();  // we can use priority queue aswell
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int len = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i =0; i<len;i++){
                TreeNode node = q.poll();
                if(node!=null){
                    temp.add(node.val);
                    if(node.left!=null){
                        q.offer(node.left);
                    }
                    if(node.right!=null){
                        q.offer(node.right);
                    }
                }
            }
            if(!temp.isEmpty())ans.add(temp);
        }

        for(int i =0; i<ans.size();i++){
            if(i%2!=0) {
                Collections.reverse(ans.get(i));
            }
        }
        return ans;
    }
}