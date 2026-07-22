class Solution {
    static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
    public int orangesRotting(int[][] grid) {
           return bfs(grid);
    }
    private int bfs(int[][]greed){
        int fresh = 0;
        Queue<int[]>que= new ArrayDeque<>();
        for(int i = 0 ; i<greed.length; i++){
            for(int j = 0 ; j<greed[0].length;j++){
               if(greed[i][j]==2){
                que.offer(new int[]{i,j});
               }else if(greed[i][j]==1){
                fresh++;
               }else{
                continue;
               }
            }
        }
        if(fresh==0 ){
            return 0;
        }
            int minutes = 0 ;
            while(!que.isEmpty()){
                int size = que.size();
                for(int i = 0 ; i<size;i++){
                    int curr[] = que.poll();
                    int row = curr[0];
                    int col = curr[1];
                    for(int x[]:dir){
                        int newRow = x[0]+row;
                        int newCol = x[1]+col;
                        if(newRow>=0&& newCol>=0&&greed.length>newRow&&greed[0].length>newCol&&greed[newRow][newCol]==1){
                            greed[newRow][newCol]=2;
                            fresh--;
                            que.offer(new int []{newRow,newCol});
                        }
                    }
                }
                minutes++;
            }
            if(fresh==0){
                   return minutes-1;
            }
            return -1;
    }
}
    
    
