class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      Arrays.sort(candidates);
      List<Integer>list = new ArrayList<>();
      List<List<Integer>>result = new ArrayList<>();
      helper(list,result,candidates,target,0,0);
      return result;
   }
   private void helper(List<Integer>list,List<List<Integer>>result,int[] candidates,int target, int sum,int index){
     if(sum==target){
        result.add(new ArrayList<>(list));
        return ;
     }
     if(sum>target|| index==candidates.length){
        return ;
     }
     list.add(candidates[index]);
     sum+=candidates[index];
     helper(list,result,candidates,target,sum,index);

     sum-=candidates[index];
     list.remove(list.size()-1);

     helper(list,result,candidates,target,sum,index+1);
   }
}