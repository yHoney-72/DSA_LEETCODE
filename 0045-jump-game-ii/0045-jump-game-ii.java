class Solution {
    public int jump(int[] nums) {
        int jump = 0 ;
        int distance = 0 ;
        int jumpendPos = 0;
        for(int i = 0 ; i<nums.length-1;i++){
            distance = Math.max(distance,i+nums[i]);
            if(i==jumpendPos){
                jump++;
                jumpendPos = distance;
            }
        }
        return jump ;
    }
}