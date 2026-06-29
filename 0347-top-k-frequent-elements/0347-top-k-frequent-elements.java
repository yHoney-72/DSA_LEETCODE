class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int result[] = new int[k];
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int index = 0;
        PriorityQueue<Map.Entry<Integer,Integer>>pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            pq.offer(entry);
           
        }
        while(index<k){
                result[index] = pq.poll().getKey();
                index++;
            }
        return result ;
    }
}