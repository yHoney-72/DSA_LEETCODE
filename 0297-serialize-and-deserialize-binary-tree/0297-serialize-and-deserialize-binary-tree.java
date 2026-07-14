/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    int index = 0 ;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
       return dfs(root);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
      String[]arr = data.split(",");
         index = 0 ;
        return fun(arr);
    }
    private String dfs(TreeNode root){
        if(root==null){
            return "Null,";
        }
        String left = dfs(root.left);
        String right = dfs(root.right);
        return root.val+","+left+right;
    }
    private TreeNode fun(String[]arr){
        if(arr[index].equals("Null")){
            index++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(arr[index]));
        index++;
        root.left = fun(arr);
        root.right = fun(arr);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));