class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
     int startIndex = 0 ;
     int totalfuel = 0 ;
     int totalcost = 0 ;
     int currenttank = 0 ;
     for(int i = 0 ;i<gas.length;i++){
        totalfuel+=gas[i];
        totalcost+=cost[i];
        currenttank+=gas[i]-cost[i];
        if(currenttank<0){
            currenttank = 0 ;
            startIndex=i+1;
        }
     }
     if(totalfuel<totalcost){
        return -1;
     }
     return startIndex;
    }
}