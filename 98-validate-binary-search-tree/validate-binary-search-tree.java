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
    public boolean isValidBST(TreeNode root) {
        long max = Long.MAX_VALUE;
        long min = Long.MIN_VALUE;
        return isValid(root, max, min);
        
    }
    public boolean isValid(TreeNode curr, long max, long min){
        if(curr == null)
            return true;
        int val = curr.val;
        if(val > min && val < max){
            return isValid(curr.left, curr.val, min) && isValid(curr.right, max, curr.val);
        }
        else
            return false;
    }
}