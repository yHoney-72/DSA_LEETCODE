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
    List<Integer>list = new ArrayList<>();
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        PreOrder(root);
        TreeNode curr = root;
        curr.left = null;
        for(int i=1;i<list.size();i++){
            curr.right = new TreeNode(list.get(i));
            curr = curr.right;
        }
    }
    private void PreOrder(TreeNode root){
        if(root==null){
            return;
        }
        list.add(root.val);
        PreOrder(root.left);
        PreOrder(root.right);
    }
}