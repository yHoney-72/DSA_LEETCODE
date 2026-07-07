class Solution {
    public List<List<String>> solveNQueens(int n) {
       List<List<String>> result = new ArrayList<>();
       char board[][] = new char[n][n];
       for(int i = 0 ; i<n; i++){
        Arrays.fill(board[i],'.');
       }
       nQueens(result,board,n,0);
       return result;
  }
    private void nQueens(List<List<String>> result, char board[][] , int n , int row ){
        
      if(row==n){
        List<String>current = new ArrayList<>();
        for(int i = 0 ; i<n; i++){
            current.add(new String(board[i]));
        }
        result.add(current);
        return;
      }

      for(int col = 0 ; col< n; col++){
        if(isSafe(board,n,row,col)){
            board[row][col] = 'Q';
            nQueens(result,board,n,row+1);
            board[row][col]='.';
        }
        
        
      }

  }
    private boolean isSafe(char board[][],int n , int row, int col){
        for(int i = 0 ; i<n;i++){
            if(board[i][col]=='Q'){//col check
                return false;
            }
        }
        for(int j = 0 ; j<n ; j++){
            if(board[row][j]=='Q'){ // row check
                    return false;
              }
                
          }
          for(int i = row,j=col;i>=0&&j>=0;i--,j--){ // left diagonal check
            if(board[i][j]=='Q'){
                return false;
            }
          }
          for(int i = row , j=col;i>=0&&j<n;i--,j++){ // right check
            if(board[i][j]=='Q'){
                return false;
            }
          }
          return true;
    }
}