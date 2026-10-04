class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        List<List<Integer>>result = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        Arrays.sort(nums);
        helper(result,list,nums,n,0);
        return result;

    }
    private void helper(List<List<Integer>>result,List<Integer>list,int[]nums,int n,int start){
        result.add(new ArrayList<>(list));
        for(int i=start;i<n;i++){
            if(i>start&&nums[i]==nums[i-1]){
               continue;
            }
           list.add(nums[i]);
           helper(result,list,nums,n,i+1);
           list.remove(list.size()-1);
           
        }
    }  
}