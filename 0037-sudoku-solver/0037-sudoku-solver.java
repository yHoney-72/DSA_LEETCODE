class Solution {
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
    }
    private boolean isValid(char[][] board,char num, int row , int col){
        for(int i = 0 ; i<9; i++){
            if(board[i][col]==num|| board[row][i]==num){
                return false;
            }
            int newRow = 3*(row/3)+i/3;
            int newCol = 3*(col/3)+i%3;
            if(board[newRow][newCol]==num){
                return false;
            }

        }
        return true;
    }
    private boolean solve(char[][]board, int row, int col){
        if(row==9){
            return true;
        }
        if(col==9){
            return solve(board,row+1,0);
        }
        if(board[row][col]!='.'){
            return solve(board,row,col+1); 
        }
        for(char num = '1' ; num<='9'; num++){
            if(isValid(board,num,row, col)){
                board[row][col]= num;
                if(solve(board,row,col+1)){
                    return true;
                }
                board[row][col]='.';
            }
        }
        return false;
    }
}