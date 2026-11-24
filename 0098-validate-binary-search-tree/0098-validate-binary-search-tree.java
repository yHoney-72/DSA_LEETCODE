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
    public boolean isValidBST(TreeNode root) {
       if(root==null){
        return true;
       }
       list = new ArrayList<>();
       helper(root);
       for(int i=0;i<list.size()-1;i++){
          if(list.get(i)>=list.get(i+1)){
            return false;
          }
       }
       return true;
    }
    private void helper(TreeNode root){
      if(root==null){
        return ;
      }
       helper(root.left);
        list.add(root.val);
       helper(root.right);
    }
}

// BST rule:
// - Left subtree ke saare nodes strictly smaller (<) hone chahiye.
// - Right subtree ke saare nodes strictly greater (>) hone chahiye.
//2,2,2 hai to ye valid bst n kyuki 2<2 false hai 