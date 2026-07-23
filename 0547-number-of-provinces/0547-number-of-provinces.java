class Solution {
    public int findCircleNum(int[][] isConnected) {
       int n = isConnected.length;
       int province = 0 ;
       boolean visited[] = new boolean[n];
        for(int city = 0 ; city<n; city++){
            if(visited[city]==false){
                 province++;
                 dfs(isConnected,visited,city);
            }
        }
        return province;
     }
     private void dfs(int isConnected[][],boolean[]visited,int city){
        visited[city]=true;
        for(int newcity = 0 ; newcity<isConnected.length;newcity++){
          if(isConnected[city][newcity]==1&&visited[newcity]==false){
            dfs(isConnected,visited,newcity);
          }
        }
     }
}
