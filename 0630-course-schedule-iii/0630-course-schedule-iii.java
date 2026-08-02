class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses,(a,b)->a[1]-b[1]);
        PriorityQueue<Integer>maxHeap = new PriorityQueue<>((a,b)->b-a);
        int totalDays = 0 ;
        for(int course[]:courses){
             maxHeap.offer(course[0]);
             totalDays+=course[0];
             if(totalDays>course[1]){
                int longest = maxHeap.remove();
                totalDays-=longest;
             }
        }
        return maxHeap.size();
    }
}