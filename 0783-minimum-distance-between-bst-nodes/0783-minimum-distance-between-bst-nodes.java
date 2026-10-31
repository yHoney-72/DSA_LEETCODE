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
    public int minDiffInBST(TreeNode root) {
        int Min = Integer.MAX_VALUE;
        List<Integer>list = new ArrayList<>();
        helper(root,list);
        list.sort((a,b) -> Integer.compare(a,b));
        for(int i=0;i<list.size()-1;i++){
           int diff = Math.abs(list.get(i)-list.get(i+1));
           Min = Math.min(Min, diff);
        }
        return Min;
    }
    private void helper(TreeNode root,List<Integer>list){
        if(root==null){
            return ;
        }
        list.add(root.val);
        helper(root.left,list);
        helper(root.right,list);
    }
   
}