class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>>result = new ArrayList<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        if(nums1== null || nums2== null ||n1==0 || n2==0){
            return result;
        }
        PriorityQueue<int[]>heap = new PriorityQueue<>(new ElementComparing());
        int limit = Math.min(n1,k);
        for(int i = 0; i<limit;i++){
            heap.offer(new int[]{nums1[i]+nums2[0],i,0});

        }
        while(!heap.isEmpty()&&k>0){
            int curr[] = heap.poll();
            int x = curr[1];
            int y = curr[2];
             List<Integer> pair = new ArrayList<>();
            pair.add(nums1[x]);
            pair.add(nums2[y]);
          result.add(pair);
          k--;
          if(y<n2-1){
            heap.offer(new int[]{nums1[x]+nums2[y+1],x,y+1});
          }
        }
        return result;
    }
}
class ElementComparing implements Comparator<int[]>{
    @Override
    public int compare(int a[] , int b[]){
        return a[0]-b[0];
    }
}