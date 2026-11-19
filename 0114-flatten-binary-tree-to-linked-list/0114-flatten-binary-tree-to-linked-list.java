class Solution {
    TreeNode prev = null;
    public void flatten(TreeNode root) {
        if(root==null){
            return ;
        }
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left =null;
        prev = root;
    }
}        


//Jab bhi tree mein pointers todne par aage ka rasta khone ka darr ho, toh ulta traversal (Bottom-Up / Reverse) sochna chahiye.