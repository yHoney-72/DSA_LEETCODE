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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return compare(p,q);
    }
    private boolean compare(TreeNode p , TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null){
            return false ;
        }
        if(q==null){
            return false;
        }
        int root1 = p.val;
        int root2 = q.val;
        if(root1!=root2){
            return false;
        }
        boolean leftsame = compare(p.left,q.left);
        boolean rightsame = compare(p.right,q.right);
        return leftsame && rightsame;
    }
}