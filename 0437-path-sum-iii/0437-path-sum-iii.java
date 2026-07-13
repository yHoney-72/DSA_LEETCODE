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
    int count =0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return 0;
        }
        fun(root,targetSum,0L);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        return count;
}
private void fun(TreeNode root , int target , long total){
    if(root==null){
        return ;
    }
    total+=root.val;
    if(total==target){
        count++;
    }
    fun(root.left,target,total);
    fun(root.right,target,total);
}
}