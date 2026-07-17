class Solution {
    class TrieNode{
        TrieNode children[] /*= new TrieNode[26];*/;
        String word;
        TrieNode() {
        children = new TrieNode[26];
    }
    }
    TrieNode root = new TrieNode();
    public List<String> findWords(char[][] board, String[] words) {
        List<String>result= new ArrayList<>();
        for(String word: words){
            insert(word);
        }
        for(int i = 0 ; i<board.length; i++){
            for(int j = 0 ; j<board[0].length; j++){
                dfs(board,i,j,root,result);
            }
        }
       return result ;
    }
    private void insert(String word){
        TrieNode current = root;
        for(int i = 0 ;i< word.length();i++){
            int index = word.charAt(i)-'a';
            if(current.children[index]==null){
               current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
         current.word = word;
    }
    private void dfs(char[][] board, int row , int col , TrieNode current, List<String>ans){
        if(row<0||row>=board.length||col<0||col>=board[0].length){
            return ;
        }
        char ch = board[row][col];
        if(ch=='#'){
            return ;
        }
        if(current.children[ch-'a']==null){
            return ;
        }
        current = current.children[ch - 'a'];
        if(current.word!=null){
            ans.add(current.word);
            current.word= null;
        }
        board[row][col]='#';
        dfs(board,row-1,col,current,ans);
         dfs(board,row+1,col,current,ans);
          dfs(board,row,col+1,current,ans);
           dfs(board,row,col-1,current,ans);
           board[row][col]=ch;
    }
}