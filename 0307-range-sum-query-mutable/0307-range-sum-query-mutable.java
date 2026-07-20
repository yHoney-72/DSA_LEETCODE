class NumArray {
     static int tree[];
     static int n ; 
     static int[]nums;
    public NumArray(int[] nums) {
        this.nums= nums;
        this.n = nums.length;
      this.tree= new int[4*nums.length];
      build(1,0,nums.length-1);
    }
    
    public void update(int index, int val) {
        updateHelper(1,0,nums.length-1,index,val);
    }
    
    public int sumRange(int left, int right) {
        return sumRangeHelper(1,0,nums.length-1,left,right);
    }
    private void build(int node ,int start,int end){
        if(start==end){
            tree[node]=nums[start];
            return ;
        }
        if(start>end){
            return;
        }
        int mid = start+(end-start)/2;
        build(2*node,start,mid);
        build(2*node+1,mid+1,end);
        tree[node]= tree[2*node]+tree[2*node+1];
    }
    private void updateHelper(int node , int start , int end , int index , int val){
        if(start==end){
            tree[node]=val;
            nums[index]= val;
            return;
        }
        if(start > end)
         return;
        int mid = start+(end-start)/2;
        if(index<=mid){
        updateHelper(2*node,start,mid,index,val);
        }else{
        updateHelper(2*node+1,mid+1,end,index,val);
        }
        tree[node]= tree[2*node]+tree[2*node+1];
    }
    private int sumRangeHelper(int node, int start, int end , int left , int right){
        if(start>right||end<left){
            return 0 ; 
        }
        if(left<=start&&end<=right){
            return tree[node];
        }
        int mid = start+(end-start)/2;
        int leftrange = sumRangeHelper(2*node,start,mid,left,right);
        int rightrange = sumRangeHelper(2*node+1,mid+1,end,left,right);
        return leftrange+rightrange;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */