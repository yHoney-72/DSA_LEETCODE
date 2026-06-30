class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[] = new int[26];
        for(char i: tasks){
            freq[i-'A']++;
        }
        PriorityQueue<Integer>maxHeap = new PriorityQueue<>((a,b)->b-a);
        for(int i : freq){
            if(i>0)
            maxHeap.offer(i);
        }
        Queue<int[]>cooldownQue = new LinkedList<>();
        int time = 0 ;
        while(!maxHeap.isEmpty()|| !cooldownQue.isEmpty()){
            time++;
            if(!maxHeap.isEmpty()){
               int remFreq = maxHeap.poll()-1; 

                if(remFreq>0){
                cooldownQue.offer(new int[]{remFreq,time+n});
            }

            }
            if(!cooldownQue.isEmpty()&& cooldownQue.peek()[1]==time){
                maxHeap.offer(cooldownQue.poll()[0]);
            }
           
        }
        return time;
    }
}