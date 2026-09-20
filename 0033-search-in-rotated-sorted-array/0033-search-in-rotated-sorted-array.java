class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low =0, high = n-1;
        int pivot = 0;
        while(low<high){
            int mid = low+(high-low)/2;
            if(nums[mid]>nums[high]){
                low = mid+1;
            }else{
                high = mid;
            }
        }
         pivot = low;
        if(target>=nums[pivot]&& target<=nums[n-1]){
            low = pivot;
            high = n-1;
        }else{
            low =0;
            high = pivot -1;
        }
        while(low<=high){
         int mid = low+(high-low)/2;
          if(target==nums[mid]){
            return mid;
          }else if(target>nums[mid]){
                low = mid+1;
          }else{
                high = mid-1;
          }
        }
        return -1;
    }
}