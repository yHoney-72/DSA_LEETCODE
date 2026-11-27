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
    int inorder[];
    HashMap<Integer,Integer>map;
    int preIdx = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        int n = preorder.length;
        map = new HashMap<>();
        inorder = Arrays.copyOf(preorder,n);
        Arrays.sort(inorder);
        for(int i=0;i<n;i++){
            map.put(inorder[i],i);
        }
        return helper(preorder,0,n-1);
    }
    private TreeNode helper(int[]preorder, int st, int end){
        if(st>end){
            return null;
        }
        int val = preorder[preIdx++];
        TreeNode root = new TreeNode(val);
        int inIdx = map.get(val);
        root.left = helper(preorder,st,inIdx-1);
        root.right = helper(preorder,inIdx+1,end);
        return root;
    }
}