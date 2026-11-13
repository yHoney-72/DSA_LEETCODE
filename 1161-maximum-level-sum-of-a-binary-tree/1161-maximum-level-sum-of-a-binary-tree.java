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
    public int maxLevelSum(TreeNode root) {
        if(root==null){
            return -1;
        }
        int sum = Integer.MIN_VALUE;
        int ans = -1;
        int level = 1;
        Queue<TreeNode>que = new ArrayDeque<>();
        que.offer(root);
        while(!que.isEmpty()){
            int size = que.size();
            int sumLevel =0;
            for(int i=0;i<size;i++){
                TreeNode node = que.poll();
                sumLevel+=node.val;
                if(node.left!=null){
                    que.offer(node.left);
                }
                if(node.right!=null){
                    que.offer(node.right);
                }
            }
            if(sum<sumLevel){
                sum = sumLevel;
                ans = level;
            }
            level++;

        }
        return ans;
}
}