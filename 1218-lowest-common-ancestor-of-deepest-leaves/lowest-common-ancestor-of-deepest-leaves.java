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
    static class DeepestNodes{
        int first;
        int second;
        DeepestNodes(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        //find deepest leaves func
        //find lca dunction
        //return node
        DeepestNodes Pair = findDeepest(root);
        int p = Pair.first;
        int q = Pair.second;
        return lowestCommonAncestor(root, p, q);


    }
    public DeepestNodes findDeepest(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int first = 0;
        int last = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            first = (((LinkedList<TreeNode>) queue).peekFirst()).val;
            last = (((LinkedList<TreeNode>) queue).peekLast()).val;
            while(size != 0){
                TreeNode curr = queue.poll();
                if(curr.left != null)queue.offer(curr.left);
                if(curr.right != null)queue.offer(curr.right);
                size--;
            }
        }
        return new DeepestNodes(first,last);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, int p, int q) {
    if(root == null)
        return null;
    if(root.val == p|| root.val == q)
        return root;
    
    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right,p,q);
    if(left == null && right ==null)
        return null;
    if(left != null && right != null){
        return root;
    }
    if(left!= null)
        return left;
    else
        return right;
}

}