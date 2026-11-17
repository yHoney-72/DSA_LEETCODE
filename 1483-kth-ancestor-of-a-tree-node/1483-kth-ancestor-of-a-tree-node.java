class TreeAncestor {
    int up[][];
    private final int Con = 17;
    public TreeAncestor(int n, int[] parent) {
        up = new int[n][Con];
        for(int i=0;i<n;i++){
            Arrays.fill(up[i],-1);
        }
        for(int i=0;i<n;i++){
            up[i][0] = parent[i];
        }
        for(int j = 1;j<Con;j++){
          for(int i=0;i<n;i++){
            if(up[i][j-1]!=-1){
                int mid = up[i][j-1];
                up[i][j] = up[mid][j-1];
            }
          }
        }
    }
    
    public int getKthAncestor(int node, int k) {
       for(int j =0;j<Con;j++){
        if((k& 1<<j)!=0){
            node = up[node][j];
            if(node ==-1){
                return -1;
            }
        }
       }
       return node;
    }
}

/**
 * Your TreeAncestor object will be instantiated and called as such:
 * TreeAncestor obj = new TreeAncestor(n, parent);
 * int param_1 = obj.getKthAncestor(node,k);
 */