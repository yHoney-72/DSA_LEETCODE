class Solution {
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0){
            return false;
        }
      TreeMap<Integer,int[]>map = new TreeMap<>();
      for(int i =0; i<grid.length; i++){
      for(int j =0; j<grid.length;j++){
            map.put(grid[i][j],new int[]{i,j});
      }
      }
      for(int i=0;i<map.size()-1;i++){
        int x[] = map.get(i);
        int y[] = map.get(i+1);
       int rowmoves = Math.abs(x[0]-y[0]);
       int colmoves = Math.abs(x[1]-y[1]);
       if(!((rowmoves==2&&colmoves==1)||(rowmoves==1&&colmoves==2))){
        return false;
       }
        
      }
  return true;
    }
}
/*if(!((x[0]+2==y[0]&&x[1]+1==y[1])||(x[0]+1==y[0]&&x[1]+2==y[1]))){
           return false;
        }
        fail kyuki maine sirf 2 chek ki aise 8 hai totoal (+2, -1)(-2, +1)(-2, -1)(+1, -2)(-1, +2)(-1, -2)
        */