class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrace(0,nums,result,new ArrayList<>());
        return result;
    }
    private void backtrace(int start , int[]nums,List<List<Integer>>result , List<Integer>temp  ){
        result.add(new ArrayList<>(temp));
       for(int i = start ;i<nums.length; i++){
        temp.add(nums[i]);
         backtrace(i+1,nums,result,temp);
         temp.remove(temp.size()-1);
       }
    }
}