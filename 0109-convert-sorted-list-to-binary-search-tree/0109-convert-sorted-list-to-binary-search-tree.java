/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    List<Integer> ele = new ArrayList<>();
    public TreeNode sortedListToBST(ListNode head) {
    collect(head);
    // System.out.println(ele);
    return BuildBST(ele,0, ele.size()-1);
    }

    void collect(ListNode head){
        while(head !=null){
            ele.add(head.val);
            head=head.next;
        }
    }
    TreeNode BuildBST(List<Integer> ans , int st , int en){
        if(st>en) return null;
        int mid = st+(en-st)/2;
        TreeNode root = new TreeNode(ans.get(mid));
        root.left = BuildBST(ans , st , mid-1);
        root.right = BuildBST(ans , mid+1 , en);
        return root;
    }

}