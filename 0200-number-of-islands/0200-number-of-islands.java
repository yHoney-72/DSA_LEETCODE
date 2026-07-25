class Solution {
    static int [][]dir = {{-1,0},{1,0},{0,-1},{0,1}};
    public int numIslands(char[][] grid) {
        int count = 0 ;
        for(int i = 0 ; i<grid.length;i++){
            for(int j = 0 ; j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                 count++;
                 dfs(grid,i,j);
                }
            }
        }
        return count ;
    }
    private void dfs(char[][]grid,int row,int col){
        if(row<0||row>grid.length-1||col<0||col>grid[0].length-1||grid[row][col]=='0'){
         return ;
        }
        grid[row][col]='0';
        for(int x[]:dir){
            int newRow = x[0]+row;
            int newCol = x[1]+col;
            dfs(grid,newRow,newCol);
        }
    }
}