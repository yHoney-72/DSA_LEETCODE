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
    List<Integer>list;
    public TreeNode convertBST(TreeNode root) {
        if(root==null){
            return null;
        }
        list = new ArrayList<>();
        collect(root);
        list.sort((a,b)->b-a);
         helper(root);
         return root;
    }
    private void collect(TreeNode root){
        if(root==null){
            return ;
        }
        list.add(root.val);
        collect(root.left);
        collect(root.right);
    } 
    private void helper(TreeNode root){
        if(root==null){
            return ;
        }
        root.val = calSum(root.val);
        helper(root.left);
        helper(root.right);
       
    }
    private int  calSum(int val){
        int sum =0;
        for(int i=0;i<list.size();i++){
             sum+=list.get(i);
            if(list.get(i)==val){
                break;
            }
        }
        return sum;
    }
}