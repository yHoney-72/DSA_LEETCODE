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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root,targetSum , 0);
    }
   private boolean helper(TreeNode root , int targetSum , int total){
    if(root==null){
        return false; 
    }
      total+=root.val;
      if(root.left==null && root.right==null){
        return total==targetSum;
      }
      boolean leftpart = helper(root.left , targetSum, total);
      boolean rightpart = helper(root.right ,targetSum,total);
      return leftpart ||rightpart;
   }
}