class Solution {
    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length;
        if(grid[0][0]!=0)
        return false;
        int row = 0;
        int col =0;
        int counter = 1;
        int dr[] = {2,2,-2,-2,1,-1,1,-1};
        int dc[] = {1,-1,-1,1,2,2,-2,-2};
        int k = 0;
        while(counter <n*n){
           int newRow = row+dr[k];
           int newCol = col+dc[k];
           if(newRow<n&&newCol<n&&newRow>=0&&newCol>=0){
              if(grid[newRow][newCol]==counter){
                row = newRow;
                col = newCol;
                counter++;
                k=0;
              }else{
                k++;    //counter ke equal n hai to doosra dr dc check
              }
           }else{
             k++; // not valid newrow newcol to doosra dr dc check
           }
           if(k==8){
            return false;
           }
        }
        return true;
    }
}