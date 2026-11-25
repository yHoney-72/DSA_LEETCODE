class KthLargest {
   ArrayList<Integer>list;
   int k ;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        list = new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }
        list.sort((a,b)->b-a);
        
    }
    
    public int add(int val) {
      list.add(val);
       list.sort((a,b)->b-a);
      return list.get(k-1);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */