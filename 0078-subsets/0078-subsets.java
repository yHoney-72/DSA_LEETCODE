class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>>result = new ArrayList();
      List<Integer>list = new ArrayList<>();
      helper(nums,list,result,nums.length,0);
      return result;
    }
    private void helper(int nums[],List<Integer>list,List<List<Integer>>result,int n,int start){
       if(start==n){
        result.add(new ArrayList<>(list));
         return ;
       }
       list.add(nums[start]);
       helper(nums,list,result,n, start+1);
       list.remove(list.size()-1);
       helper(nums,list,result,n,start+1);
    }
}