class Solution {
    public int findDuplicate(int[] nums) {
     int slow = nums[0];
     int fast = nums[0];

     while(true){//dono ka starting point same hai isliye slow!=fast (X)
        slow = nums[slow];   // 1 step ==> ek baar jump
        fast = nums[nums[fast]]; // 2 step ==> do baar jump
        if(slow==fast){
            break;
        }
     }
     fast = nums[0];
     while(slow!=fast){
        slow = nums[slow];
        fast = nums[fast];
     }
     return fast; //slow
    }
}