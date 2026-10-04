class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>>result = new ArrayList();
      List<Integer>list = new ArrayList<>();
      helper(nums,list,result,nums.length,0);
      return result;
    }
    private void helper(int nums[],List<Integer>list,List<List<Integer>>result,int n,int start){
        result.add(new ArrayList<>(list));
        for(int i=start;i<n;i++){
            list.add(nums[i]);
            helper(nums,list,result,n,i+1);
            list.remove(list.size()-1);
        }
    }
}