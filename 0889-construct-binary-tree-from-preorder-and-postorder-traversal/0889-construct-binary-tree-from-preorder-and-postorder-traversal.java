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
    private  HashMap<Integer,Integer> map = new HashMap<>();
    private int preIdx = 0;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n = postorder.length;
        for(int i=0;i<n;i++){
            map.put(postorder[i],i);
        }
        return buildTree(preorder,postorder,0,n-1);
    }
    private TreeNode buildTree(int[] preorder, int[] postorder,int st, int end){
        if(st>end){
            return null;
        }
        int value = preorder[preIdx++];
        TreeNode root = new TreeNode(value);
        if(st==end){
            return root;
        }
        int leftValue = preorder[preIdx];
        int postIdx = map.get(leftValue);
        root.left = buildTree(preorder, postorder,st,postIdx);
        root.right = buildTree(preorder,postorder,postIdx+1,end-1);
        return root;
    }
}