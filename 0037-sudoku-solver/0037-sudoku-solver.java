class Solution {
    public void solveSudoku(char[][] board) {
       helper(board,0,0);
    }
    private boolean helper(char[][]board,int row, int col){
        if(row==9){
            return true ;
        }
        if(col==9){
             return helper(board,row+1,0);
             
        }
        if(board[row][col]!='.'){
           return helper(board,row,col+1);
        }
        for(int i=1;i<=9;i++){
            if(checker(board,row,col,i)){
                board[row][col]=(char)(i+'0');
                if(helper(board,row,col+1)){
                    return true;
                }
                board[row][col]='.';
            }
        }
        return false;
        }
    
    private boolean checker(char[][]board,int row, int col,int num){
        char value = (char)(num+'0');
        for(int i=0; i<9;i++){
            if(board[i][col]==value){
                return false;
            }
        }
        for(int j=0; j<9;j++){
            if(board[row][j]==value){
                return false;
            }
        }
        int boxrow = (row/3)*3;
        int boxcol= (col/3)*3;
        for(int i=boxrow;i<=boxrow+2;i++){
            for(int j=boxcol;j<=boxcol+2;j++){
                if(board[i][j]==value){
                    return false;
                }
            }
        }
        return true;
    }
}