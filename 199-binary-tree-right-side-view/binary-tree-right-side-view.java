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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        //edge case of 0 nodes
        if(root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            //deque until last elemnt
            TreeNode rightmost = null;
            while(size > 0){
                TreeNode curr = queue.poll();
                //track non null node
                //if non null also add in queue
                if(curr != null){
                    rightmost = curr;
                    queue.offer(curr.left);
                    queue.offer(curr.right);
                }
                size--;
            }
            if(rightmost != null)
                res.add(rightmost.val);
            
        }
        return res;

    }
}