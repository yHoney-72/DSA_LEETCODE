class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int totalGas = 0;
       int totalCost =0;
       for(int i =0;i<gas.length;i++){
          totalGas+=gas[i];
          totalCost+=cost[i];
       }
       if(totalGas<totalCost){
        return -1;
       }
       int currentGas =0;
       int start = 0;
       for(int i=0;i<gas.length;i++){
           int gasLeft = gas[i]-cost[i];
           currentGas+=gasLeft;
           if(currentGas<0){
            start = i+1;
            currentGas =0;
           }
       }
       return start;
    }
}