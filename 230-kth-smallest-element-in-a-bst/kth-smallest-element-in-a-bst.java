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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> inorder = new ArrayList<>();
        traverse(root,inorder);
        return inorder.get(k-1);

    }
    public void traverse(TreeNode root, List<Integer> inorder){
        if(root == null)
            return;
        traverse(root.left, inorder);
        inorder.add(root.val);
        traverse(root.right, inorder);
    }
}