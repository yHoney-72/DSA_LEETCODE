class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>result = new ArrayList<>();
        List<Integer>current = new ArrayList<>();
        Arrays.sort(candidates);
        backTrace(result , current, target,candidates,0);
        return result;
    }
    private void backTrace(List<List<Integer>>result,List<Integer>current,int target ,int[] candidates,int m){
        if(target==0){
            result.add(new ArrayList<>(current));
         return ;
        }
        for(int i =m;i<candidates.length;i++){
            if(candidates[i]>target){
                break;
            }
            current.add(candidates[i]);
            backTrace(result,current,target-candidates[i],candidates,i);
            current.remove(current.size()-1);
        }
    }
}