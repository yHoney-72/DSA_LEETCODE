class Solution {
    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length ;
     if(grid[0][0]!=0){
        return false;
     }
     int[] dx = {2, 2, -2, -2, 1, 1, -1, -1};
     int[] dy = {1, -1, 1, -1, 2, -2, 2, -2};
     int row = 0;
     int col = 0;
     int counter =1;
     int k = 0;
     while(counter<n*n){
        int newRow = row+dx[k];
        int newCol = col+dy[k];
        if(newRow<n&&newCol<n&&newRow>=0&&newCol>=0){
           if(grid[newRow][newCol]==counter){
              row = newRow;
              col = newCol;
              k =0;
              counter++;
           }else{
              k++;
           }
        }
        else{
            k++;
        }
        if(k==8){
            return false;
        }
     }
     return true;
    }
}
