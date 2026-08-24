class Solution {
    static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        char arr[] = word.toCharArray();
        int k = 0;
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i = 0; i<n;i++){
            for(int j = 0 ;j<m;j++){
                if(board[i][j]==arr[k]){
                   visited[i][j] = true;
                boolean found=  helper(k+1,i,j,board,arr,visited);
                visited[i][j] = false;
                if(found){
                    return true;
                }
                }
            }
        }
        return false;
    }
    private boolean helper(int k , int i , int j,char board[][],char arr[],boolean visited[][]){
        if(k==arr.length){
            return true;
        }
        for(int x[]:dir){
          int newRow = x[0]+i;
          int newCol = x[1]+j;
         if(newRow>=0&&newCol>=0&&newRow<board.length&& newCol<board[0].length&&visited[newRow][newCol]==false){
            if(board[newRow][newCol]!=arr[k]){
                continue;
            }else{
                visited[newRow][newCol] = true;
               boolean found =  helper(k+1,newRow,newCol,board,arr,visited);
               visited[newRow][newCol] = false;
               if(found){
                return true;
               }
            }
            }
         }
         return false;
        }
    }