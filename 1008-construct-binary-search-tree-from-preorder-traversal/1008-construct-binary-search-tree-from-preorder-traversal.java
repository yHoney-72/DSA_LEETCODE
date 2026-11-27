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
    int preIdx = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
         return helper(preorder,Long.MIN_VALUE, Long.MAX_VALUE);
        
    }
    private TreeNode helper(int[]preorder,long min, long max){
        if(preIdx==preorder.length){
            return null;
        }
        int val = preorder[preIdx];
        if(val<=min||val>=max){
            return null;
        }
        preIdx++;
        TreeNode root = new TreeNode(val);
        root.left = helper(preorder,min,val);
        root.right = helper(preorder,val,max);
        return root;
    }
}