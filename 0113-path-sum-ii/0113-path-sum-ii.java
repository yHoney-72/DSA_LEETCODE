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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer>current = new ArrayList<>();
        fun(root,targetSum,result,current,0);
        return  result;
    }
    private void fun(TreeNode root , int targetSum , List<List<Integer>> result, List<Integer>current,int total){
        boolean match = false;
        if(root==null){
          return ;
        }
              
        total+=root.val;
        current.add(root.val);
         if (root.left == null && root.right == null && total == targetSum) {
            result.add(new ArrayList<>(current));
        }

       
        fun(root.left,targetSum,result,current,total);
         fun(root.right,targetSum,result,current,total);
         current.remove(current.size()-1);
    }
}