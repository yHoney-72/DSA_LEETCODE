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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>list = new ArrayList<>();
        bfs(root,list);
        return list;
    }
    private void bfs(TreeNode root,List<List<Integer>>list){
        if(root==null){
            return ;
        }
        Queue<TreeNode>que = new ArrayDeque<>();
        que.offer(root);
        while(!que.isEmpty()){
            List<Integer>list1 =  new ArrayList<>();
            int size = que.size();
            for(int i=0;i<size;i++){
                TreeNode node = que.poll();
                list1.add(node.val);
                if(node.left!=null){
                    que.offer(node.left);
                }
                if(node.right!=null){
                    que.offer(node.right);
                }
            }
            list.add(list1);
        }
    }
}