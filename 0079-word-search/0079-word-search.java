class Solution {
    static int dirs[][] = {{-1,0},{1,0},{0,-1},{0,1}};
    public boolean exist(char[][] board, String word) {
      int n = board.length;
      int m = board[0].length;
      boolean visited[][] = new boolean[n][m];
      char arr[] = word.toCharArray();
      int k =0;
      for(int i = 0 ; i<n; i++){
        for(int j = 0 ;j<m; j++){
            if(arr[k]==board[i][j]){
               visited[i][j] = true;
               boolean found = helper(k+1,i,j,board,arr,visited);
               visited[i][j] = false;
               if(found){
                 return true;
               }
            }
        }
      }
      return false;
    }
    private boolean helper(int k ,int i , int j , char[][]board,char[]arr,boolean[][]visited){
        if(k==arr.length){
            return true;
        }
        for(int dir[]:dirs){
            int newRow = dir[0]+i;
            int newCol = dir[1]+j;
           if(newRow>=0&&newRow<board.length && newCol>=0&&newCol<board[0].length&&visited[newRow][newCol]==false){
               if(board[newRow][newCol]==arr[k]){
                visited[newRow][newCol]=true;
                boolean found = helper(k+1,newRow, newCol,board,arr,visited);
                 visited[newRow][newCol]=false;
                 if(found){
                      return true;
                 }
               }
           }
        }
        return false;
    }        
}