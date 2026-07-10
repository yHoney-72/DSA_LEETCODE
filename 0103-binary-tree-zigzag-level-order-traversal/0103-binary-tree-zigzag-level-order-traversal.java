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
        List<List<Integer>>result = new ArrayList<>();
        Zigzag(root,result);
        return result;
    }
      private void Zigzag(TreeNode root, List<List<Integer>>result){
        if(root==null){
            return ;
        }
         Queue<TreeNode>que= new ArrayDeque<>();
         que.offer(root);
         boolean check = true;
         while(!que.isEmpty()){
            List<Integer>list = new ArrayList<>();
            int size = que.size();
            for(int i = 0 ; i<size ; i++){
                TreeNode curr = que.poll();
                 if(check){
                    list.addLast(curr.val);
                 }else{
                    list.addFirst(curr.val);
                 }
                if(curr.left!=null){
                    que.offer(curr.left);
                }
                if(curr.right!=null){
                    que.offer(curr.right);
                }
            }
            result.add(list);
            check = !check;
         }
      }
}