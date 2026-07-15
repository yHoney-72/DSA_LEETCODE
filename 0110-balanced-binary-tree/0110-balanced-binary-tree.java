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
    public boolean isBalanced(TreeNode root) {
       return height(root)!=-2;
    }
    private int height(TreeNode root){
        if(root==null){
            return -1;
        }
        int leftHeight =  height(root.left);
        int rightHeight = height(root.right);
        if(leftHeight==-2){ // height 0 1 se +ve number hota -2 leliye as a checker vas ye bf n hai -2 ki jagh -1 chod ke koi bi (-int) lelo vas -1 ko chod 0 and +ve int chod
            return -2;
        }
        if(rightHeight==-2){
            return -2;
        }
        if(Math.abs(leftHeight-rightHeight)>1){
            return -2;
        }
        return 1+Math.max(leftHeight,rightHeight);
    }
}