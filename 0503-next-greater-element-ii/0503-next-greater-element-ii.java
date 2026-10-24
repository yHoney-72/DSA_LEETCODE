class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
       Stack<Integer>stack = new Stack<>();
       HashMap<Integer,Integer>map = new HashMap<>();
       for(int i=0;i<n;i++){
        while(!stack.isEmpty()&&nums[stack.peek()]<nums[i]){
            map.put(stack.pop(),i);
        }
        stack.push(i);
       }
       for(int i=0;i<n;i++){
        while(!stack.isEmpty()&&nums[stack.peek()]<nums[i]){
            map.put(stack.pop(),i);
        }
       }
       for(int i=0;i<n;i++){
        if(map.containsKey(i)){
            ans[i] = nums[map.get(i)];
        }else{
            ans[i] = -1;
        }
       }
       return ans;
    }
 
}