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
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        if(n==0){
            return null;
        }
        return bst(nums,0, n-1);
    }
    private TreeNode bst(int[]nums, int leftIdx, int rightIdx){
        if(leftIdx>rightIdx){
            return null;
        }
        int midIdx = leftIdx+(rightIdx-leftIdx)/2;
        TreeNode root = new TreeNode(nums[midIdx]);
        root.left = bst(nums, leftIdx, midIdx-1);
        root.right = bst(nums,midIdx+1, rightIdx);
        return root;
    }
}