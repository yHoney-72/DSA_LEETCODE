class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int jumpPower = nums[0];
        for(int i = 1 ; i<nums.length; i++){
           jumpPower--;
           if(jumpPower<0){
            return false;
           }
           jumpPower = Math.max(jumpPower,nums[i]);
        }
        return true;
    }
}