class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i= 0;i<tickets.length;i++){
            map.put(i,tickets[i]);
        }
        int time = 0;
        while(map.containsKey(k)){
        ArrayList<Integer>list = new ArrayList<>(map.keySet());
           for(int key:list){
              int value = map.get(key)-1;
              time++;
              if(key==k && value==0){
                return time;
              }if(value==0){
                map.remove(key);
              }
              else{
                map.put(key,value);
              }
           }
        }
        return time;
    }
}