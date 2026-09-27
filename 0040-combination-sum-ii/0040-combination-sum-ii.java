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
            return;
        }
        if(sum>target){
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i>index&&candidates[i]==candidates[i-1]){
                continue;
            }
            if(sum+candidates[i]>target){
                break;
            }
            list.add(candidates[i]);
            helper(result,list,candidates,target,sum+candidates[i],i+1);
            list.remove(list.size()-1);
        }
       }
    }
