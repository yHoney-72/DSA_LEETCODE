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
    int max = 0;  // static int max n  lena nhi onld testcase ka ans print hota hai if uska max bda hai 
     public int widthOfBinaryTree(TreeNode root) {
      if(root==null){
        return max;
      }
      helper(root);
      return max;
    }
    private void helper(TreeNode root){
        Queue<TreeNode>que = new ArrayDeque<>();
        Deque<Integer>QIdx = new ArrayDeque<>();
        que.offer(root);
        QIdx.offer(0);
        while(!que.isEmpty()){
            int size = que.size();
            int a = QIdx.peekFirst();
            int b = QIdx.peekLast();
            max = Math.max(max,(b-a+1));
            for(int i =0;i<size;i++){
                TreeNode node = que.poll();
                int pointer = QIdx.poll();
                if(node.left!=null){
                    QIdx.offer(2*pointer+1);
                    que.offer(node.left);
                }
                if(node.right!=null){
                    QIdx.offer(2*pointer+2);
                    que.offer(node.right);
                }
            }
        } 
    }
}

// Java mein static variable object ka nahi, poori Class (Solution) ka hota hai, aur memory mein sirf ek hi baar banta hai.