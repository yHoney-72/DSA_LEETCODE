class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>result = new ArrayList<>();
        List<Integer>current = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backTrace(result, nums, used , current);
        return result;
    }
    private void backTrace( List<List<Integer>>result, int[] nums ,  boolean[]used , List<Integer>current){
        if(current.size()== nums.length){
            result.add(new ArrayList<>(current));
          return;
        }
        for(int i = 0 ; i<nums.length ; i++){
            if(used[i]|| (i>0 && nums[i]==nums[i-1]&& used[i-1] == false)){
                continue;
            }
            current.add(nums[i]);
            used[i] = true;
             backTrace(result, nums, used , current);
             current.remove(current.size()-1);
             used[i] = false;
        }
    }
}