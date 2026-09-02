class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
     List<Integer>list = new ArrayList<>();
     PriorityQueue<int[]>heap = new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0]));
     int left = 0, right = 0;
     while(right<nums.length){
        heap.add(new int[]{nums[right],right});
        if(right>=k-1){
          while(heap.peek()[1]<left){
            heap.poll();
          }
          list.add(heap.peek()[0]);
          left++;
        }
        right++;
     }
     int ans[] = new int[list.size()];
     for(int i =0;i<list.size();i++){
        ans[i] = list.get(i);
     }
     return ans;
    }
}