class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>result = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        helper(result,list,candidates,target,0,0);
        return result;
    }
    private void helper( List<List<Integer>>result,List<Integer>list,int[] candidates,int target,int sum,int index){
        if(sum==target){
            result.add(new ArrayList<>(list));
            return ;
        }
        if(sum>target||index==candidates.length){
            return;
        }
        int next = index+1;
        while(next<candidates.length&&candidates[index]==candidates[next]){
            next++;
        }
        list.add(candidates[index]);
        sum+=candidates[index];
        helper(result,list,candidates,target,sum,index+1);
        sum-=candidates[index];
        list.remove(list.size()-1);
        helper(result,list,candidates,target,sum,next);

    }
}