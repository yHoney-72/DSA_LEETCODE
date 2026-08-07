class Solution {
    public boolean canCross(int[] stones) {
       if(stones[1]!=1){
        return false;
       }
       HashMap<Integer,Set<Integer>>map = new HashMap<>();
       for(int stone:stones){
        map.put(stone , new HashSet<>());
       }
       map.get(0).add(0);
       for(int stone:stones){
        for(int k : map.get(stone)){
            for(int steps = k-1;steps<=k+1;steps++){
                if(steps>0&&map.containsKey(stone+steps)){
                    map.get(stone+steps).add(steps);
                }
            }
        }
       }
       int lastStone = stones[stones.length - 1];
      return map.get(lastStone).size() > 0;
    }
}