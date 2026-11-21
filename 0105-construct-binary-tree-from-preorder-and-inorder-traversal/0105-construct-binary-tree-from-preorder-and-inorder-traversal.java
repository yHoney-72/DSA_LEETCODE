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
    private int preIndex =0;
    private HashMap<Integer,Integer>map = new HashMap<>();
    public TreeNode buildTree(int[] preOrder, int[] inorder) {
     int n = inorder.length;
     for(int i=0;i<n;i++){
        map.put(inorder[i],i);
     }
     return buildTree(preOrder,0,n-1);
    }
    private TreeNode buildTree(int[]preOrder,int start,int end){
        if(start>end){
            return null;
        }
        int value =  preOrder[preIndex++];
        int inIndex = map.get(value);
        TreeNode root = new TreeNode(value);
        root.left = buildTree(preOrder,start,inIndex-1);
        root.right = buildTree(preOrder,inIndex+1,end);
        return root;
    }
}