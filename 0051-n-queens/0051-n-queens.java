class Solution {
    public List<List<String>> solveNQueens(int n) {
      List<List<String>>result = new ArrayList<>();
      List<String>list = new ArrayList<>();
      char[][]board = new char[n][n];
      for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        board[i][j] = '.';
    }
}
      helper(result,list,0,board,n);
      return result;
    }
    private void helper(List<List<String>>result,List<String>list,int row,char[][]board,int n){
          if(row==n){
            result.add(new ArrayList<>(list));
            return;
          }
          for(int j =0; j<n;j++){
             if(check(board,row,n,j)){
                board[row][j]='Q';
                list.add(new String(board[row]));
                helper(result,list,row+1,board,n);
                list.remove(list.size()-1);
                board[row][j]='.';
             }
          }

        }

    private boolean check(char[][]board, int row, int n,int col ){
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int j=0; j<col; j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}