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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //map inorder for look up
        //make split function with root index left and right preorder and inorder map
        //mid index 

        //map
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for(int node : inorder)
            map.put(node, index++);

        //mapped all inorder
        int rootindex = 0;
        int l = 0;
        int r = preorder.length-1;

        return split(preorder, map, rootindex, l, r);
    }
    public TreeNode split(int[] preorder, Map<Integer,Integer> map, int rootindex, int l, int r){
        TreeNode curr = new TreeNode(preorder[rootindex]);
        int m = map.get(preorder[rootindex]);
        if(l < m){
            //call
            curr.left = split(preorder,map, rootindex+1,l,m-1);
            
        }
        if(m < r){
            //call
            curr.right = split(preorder, map, rootindex+m-l+1, +m+1,r);
        }
        return curr;
    }
}