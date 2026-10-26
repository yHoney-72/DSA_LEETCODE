class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
       HashMap<Integer,Integer>map = new HashMap<>();
       for(int i=0;i<n;i++){
        map.put(i, tickets[i]);
       }
       int time =0;
       while(map.containsKey(k)){ // ye kaam akrta tab tak jab next loop rokna hai ek baar poora traverse hua ab duabra chek ke liey hai 
        ArrayList<Integer>list = new ArrayList<>(map.keySet());
        for(int keys:list){
            int value = map.get(keys)-1;
            time++;
        if(value==0){       
            map.remove(keys);
            if(keys==k){
                return time ;
            }
        }else{
            map.put(keys,value);
        }
        }
       } 
       return time;
    }
}
// best testcase hai [2, 1, 1, 2] = tickets and k = 0 pe 