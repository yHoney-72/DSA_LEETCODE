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
    ArrayList<Integer>inorder;
    int idx =0;
    public void recoverTree(TreeNode root) {
       if(root==null){
        return ;
       }
       inorder= new ArrayList<>();
       helper(root);
       inorder.sort(null);
       formation(root);
    }
    private void helper(TreeNode root){
        if(root==null){
            return ;
        }
        helper(root.left);
        inorder.add(root.val);
        helper(root.right);
    }
    private TreeNode formation(TreeNode root){
        if(root==null){
            return null;
        }
        formation(root.left);
        root.val = inorder.get(idx++);
        formation(root.right);
      return root;
    }
}