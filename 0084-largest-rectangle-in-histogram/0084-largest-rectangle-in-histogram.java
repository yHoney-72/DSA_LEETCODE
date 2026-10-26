class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
       int ns[] = new int[n];
       int ps[] = new int[n];
       Stack<Integer>stack = new Stack();
       int max = 0 ;
       for(int i = 0 ; i<n ;i++ ){
           while(!stack.isEmpty()&& heights[i]<=heights[stack.peek()]){
            stack.pop();
           }
           ps[i] = stack.isEmpty()?-1:stack.peek();
           stack.push(i);
       }
       stack.clear();

       for(int i = n-1 ; i>=0;i--){
        while(!stack.isEmpty()&& heights[i]<=heights[stack.peek()]){
            stack.pop();
        }
        ns[i] = stack.isEmpty()?n:stack.peek();
        stack.push(i);
       }

       for(int i = 0 ; i<n ; i++){
         int width = ns[i]-ps[i]-1;
         int area = heights[i]*width;
         max = Math.max(max,area);
       }
       return max;
    }
}