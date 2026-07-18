class Solution {
    int [] parent ;
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        parent = new int[n+1];
        for(int i = 1; i<=n; i++){
            parent[i]=i;
        }
        for(int[]edge:edges){
            int u = edge[0];
            int v = edge[1];
            if(find(u)==find(v)){
                return edge;
            }
            union(u,v);
        }
        return new int[0];
    }
    private int find(int node){
        if(parent[node]==node){
            return node;
        }
        parent[node]=find(parent[node]);
            return parent[node];
    }
    private void union(int u , int v){
        int parentU = find(u);
        int parentV = find(v);
        if(parentU!=parentV){
            parent[parentV]= parentU;
        }
    }
}