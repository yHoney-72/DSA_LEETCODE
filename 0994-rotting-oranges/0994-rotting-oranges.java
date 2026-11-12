class Solution {
    static int dir[][] = {
        {-1,0},
        {1,0},
        {0,-1},
        {0,1}
    };
    int time =0;
    int fresh =0;
    Queue<int[]>que = new ArrayDeque<>();
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    que.offer(new int[]{i,j});
                }
            }
        }
           while(!que.isEmpty()&& fresh>0){
            int size = que.size();
            for(int i=0;i<size;i++){
                int curr[] = que.poll();
                 helper(grid,n,m,curr[0],curr[1]);
            }
            time++;
           }
        
        return (fresh==0)?time:-1;
     }
     private void helper(int grid[][],int n , int m,int i,int j){
        for(int x[]:dir){
            int row = x[0]+i;
            int col = x[1]+j;
            if(row>=0&&col>=0&&row<n&&col<m){
                if(grid[row][col]==1){
                    grid[row][col]=2;
                    fresh--;
                    que.offer(new int[]{row,col});
                }
            }
        }
     }
}
    
    
