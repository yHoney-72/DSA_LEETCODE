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
    private int postIdx ;
    HashMap<Integer,Integer> map;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map = new HashMap<>();
        postIdx = postorder.length - 1;
        for(int i = 0 ; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        return helper(postorder,0 , inorder.length-1);
    }
private TreeNode helper(int[]postorder , int left , int right){
    if(left>right){
        return null;
    }
    int rootvalue = postorder[postIdx--];
    TreeNode root = new TreeNode(rootvalue);
    int index = map.get(rootvalue);
    root.right= helper(postorder, index+1, right );
    root.left = helper(postorder,left , index-1);
    return  root; 
}

}