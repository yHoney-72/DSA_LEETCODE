class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>>result = new ArrayList<>();
        List<Integer>current = new ArrayList<>();
        boolean [] used = new boolean[n];
        backTrace(used,current,result,nums);
        return result;
    }

public  void backTrace(boolean []used,List<Integer>current,List<List<Integer>>result,int[]nums){
     if(current.size()==nums.length){
        result.add(new ArrayList<>(current));
        return;
     }
     for(int i = 0 ; i<nums.length; i++){
        if(used[i]== true){
            continue;
        }
        current.add(nums[i]);
        used[i] = true;
        backTrace(used,current,result,nums);
         used[i] = false;
        current.remove(current.size()-1);
     }
}
}