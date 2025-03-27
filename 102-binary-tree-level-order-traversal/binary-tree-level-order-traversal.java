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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        traverse(res, queue);
        return res;
        

    }
    
    public void traverse(List<List<Integer>> res, Queue<TreeNode> queue){
        if(queue.isEmpty())
            return;
        int size = queue.size();


        List<Integer> level = new ArrayList<>();

        while(size!=0){
            TreeNode curr = queue.poll();
            if(curr == null){
                size--;
                continue;

            }
            queue.offer(curr.left);
            queue.offer(curr.right);

            int val = curr.val;//geting int val
            level.add(val);
            size--;
        }
        //done with level
        if(level.size() == 0)
            return;
        res.add(level);
        traverse(res, queue);
        return;
    }
}