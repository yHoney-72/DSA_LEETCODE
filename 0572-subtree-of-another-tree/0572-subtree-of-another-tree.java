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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       if(root==null){
        return false;
       }
    if(isSame(root,subRoot)){
        return true;
    }
    return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }
    private boolean isSame(TreeNode n , TreeNode m){
        if(m==null&& n ==null){
            return true;
        }
        if(m==null||n==null){
            return false;
        }
        if(m.val!=n.val){
            return false;
        }
        return isSame(n.left,m.left)&&isSame(n.right,m.right);
    }
}   