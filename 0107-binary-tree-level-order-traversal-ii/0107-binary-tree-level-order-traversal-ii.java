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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    
     List<List<Integer>>list = new ArrayList<>();
     if(root==null){
        return list;
     }
     Queue<TreeNode>que = new ArrayDeque<>();
     que.offer(root);   
     while(!que.isEmpty()){
          int size = que.size();
        List<Integer>ans = new ArrayList<>();
        for(int i=0;i<size;i++){
            TreeNode node = que.poll();
            ans.add(node.val);
            if(node.left!=null){
                que.offer(node.left);
            }
            if(node.right!=null){
                que.offer(node.right);
            }
        }
        list.add(ans);
     }
     Collections.reverse(list);
     return list;
    }
}