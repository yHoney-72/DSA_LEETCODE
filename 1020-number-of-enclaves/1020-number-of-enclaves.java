class Solution {
    static int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
    public int numEnclaves(int[][] grid) {
        for(int i = 0 ; i<grid.length;i++){
            for(int j = 0 ; j<grid[0].length;j++){
                if((i==0||j==0||i==grid.length-1||j==grid[0].length-1)&&grid[i][j]==1){
                      dfs(grid,i,j);
                }
            }
        }
        int count = 0 ;
                for(int i = 0 ; i<grid.length;i++){
                    for(int j = 0 ; j<grid[0].length;j++){
                       if(grid[i][j]==1){
                        count++;
                       } 
                    }
                }
                return count ;      
    }
    private void dfs(int[][]grid,int row,int col){
        if(row<0||col<0||row>grid.length-1||col>grid[0].length-1||grid[row][col]==0){
            return ;
        }
        grid[row][col]=0;
       for(int x[]:dir){
        int newRow = row+x[0];
        int newCol = col+x[1];
        dfs(grid,newRow,newCol);
       }
    }
}