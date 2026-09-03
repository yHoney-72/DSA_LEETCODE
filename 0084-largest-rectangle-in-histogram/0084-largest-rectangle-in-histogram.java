class Solution {
    public int largestRectangleArea(int[] heights) {
      Deque<Integer>stack = new ArrayDeque<>();
      int max = 0;
      for(int i =0;i<heights.length;i++){
        while(!stack.isEmpty()&&heights[stack.peek()]>heights[i]){
            int index = stack.pop();
             int left = stack.isEmpty() ? -1 : stack.peek();
            int width = i - left - 1;
            int area = width * heights[index];
             max = Math.max(max, area);
        }
            stack.push(i);
        
      }
      while(!stack.isEmpty()){
        int index = stack.pop();
        int left = stack.isEmpty() ?-1:stack.peek();
        int width = heights.length-left-1;
        int area = width*heights[index];
        max= Math.max(max,area);
      } 
        return max;
    }

}