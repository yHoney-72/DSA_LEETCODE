class Solution {
    List<TreeNode>list;
    public void recoverTree(TreeNode root) {
        if(root==null){
            return ;
        }
        list = new ArrayList<>();
        inorder(root);
        int first =-1, second =-1;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i).val>list.get(i+1).val){
                first = i;
                break;
            }
        }
        for(int i=list.size()-1;i>0;i--){
            if(list.get(i).val<list.get(i-1).val){
                second =i;
                break;
            }
        }
        int temp = list.get(first).val;
        list.get(first).val = list.get(second).val;
        list.get(second).val= temp;
    }
    private void inorder(TreeNode root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        list.add(root);
        inorder(root.right);
    }
}
