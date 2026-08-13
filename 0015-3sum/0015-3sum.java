class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>>res = new LinkedList<>();
        for(int i = 0 ; i<n;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int left = i+1, right= n-1;
            while(left<right){
               int sum = nums[i]+nums[left]+nums[right];
               if(sum<0){
                left++;
               }else if(sum>0){
                right--;
               }else{
                List<Integer>ans = new LinkedList<>();
                ans.add(nums[i]);
                ans.add(nums[left]);
                ans.add(nums[right]);
                res.add(ans);
                while(left<right&& nums[left]==nums[left+1]){
                    left++;
                }
                while(left<right&&nums[right]==nums[right-1]){
                    right--;
                }
                left++;
                right--;
               }
            }
        }
        return res;
    }
}