/*-preorder mein root left right hai to root mila phel st se lete hai arryaPre se aur fir left call fir right call
- postOder mein left right root hai to root mila piche se lete hai arrayPost se aur fir right call left call
- rhi baat st and end ki to vo inorder se hai vo to smae ha to n change hoga
 */
class Solution {
    HashMap<Integer,Integer>map = new HashMap<>();
    int postIndex ;
    public TreeNode buildTree(int[] inorder, int[] postOrder) {
        int n = inorder.length;
        postIndex = n-1;
       for(int i =0;i<n;i++){
        map.put(inorder[i],i);
       }
       return buildTree(postOrder,0,n-1);
    }
    private TreeNode buildTree(int[]postOrder,int start, int end){
        if(start>end){
            return null;
        }
        int value = postOrder[postIndex--];
        int inIndex = map.get(value);
        TreeNode root = new TreeNode(value);
        root.right = buildTree(postOrder,inIndex+1,end);
        root.left = buildTree(postOrder,start,inIndex-1);
        return root;
    }
   
}