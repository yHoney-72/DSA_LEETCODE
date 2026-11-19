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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      List<List<Integer>>result = new LinkedList<>();
       if(root==null){
        return result;
      }
      Queue<TreeNode>que = new ArrayDeque<>();
      que.offer(root);
      boolean flag = true;
      while(!que.isEmpty()){
        int size = que.size();
        List<Integer>list = new LinkedList<>();
        for(int i =0;i<size;i++){
            TreeNode node = que.poll();
            if(flag){
                list.add(node.val);
            }else{
                list.addFirst(node.val);
            }
            if(node.left!=null){
                que.offer(node.left);
            }
            if(node.right!=null){
                que.offer(node.right);
            }
        }
        flag = !flag;// flag ki opp value dena   flag ture hai next time flag false hoga
        result.add(list);
      }
      return result;
    }
    
}