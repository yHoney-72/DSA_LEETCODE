class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
       HashMap<Integer,Integer>map = new HashMap<>();
       for(int i = 0 ;i<grid.length;i++){
        for(int j = 0 ; j<grid[i].length;j++){
            map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
        }
       }
       int m = n*n;
       int help[] = new int[m];
       for(int i = 0 ;i<m;i++){
        help[i]= i+1;
       }
       for(int i = 0 ;i<m;i++){
        map.put(help[i],map.getOrDefault(help[i],0)-1);
       }
       int res[] = new int[2];
       for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if(entry.getValue()==1){
            res[0] = entry.getKey();
        }else if(entry.getValue()==-1){
          res[1] = entry.getKey();
        }
        }
        return res;
      }    
    }
