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
    
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int[] pair = findDeepest(root);  // [first, second]
        int p = pair[0];
        int q = pair[1];
        return lowestCommonAncestor(root, p, q);
    }

    public int[] findDeepest(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int first = 0;
        int last = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            first = ((LinkedList<TreeNode>) queue).peekFirst().val;
            last = ((LinkedList<TreeNode>) queue).peekLast().val;
            while(size != 0){
                TreeNode curr = queue.poll();
                if(curr.left != null) queue.offer(curr.left);
                if(curr.right != null) queue.offer(curr.right);
                size--;
            }
        }
        return new int[]{first, last};
    }

    public TreeNode lowestCommonAncestor(TreeNode root, int p, int q) {
        if(root == null)
            return null;
        if(root.val == p || root.val == q)
            return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null)
            return root;
        return (left != null) ? left : right;
    }
}
