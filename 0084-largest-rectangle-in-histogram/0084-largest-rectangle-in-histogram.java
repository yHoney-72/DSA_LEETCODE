class Solution {
    public int largestRectangleArea(int[] heights) {
       int n = heights.length;
       int max  = Integer.MIN_VALUE;
       int[] nsl = nextSmallerLeft(heights);
       int[] nsr = nextSmallerRight(heights);
       for(int i =0;i<n;i++){
         int width = nsr[i]-nsl[i]-1;
         max = Math.max(max,(heights[i]*width));
       }
       return max;
       }
       private int[] nextSmallerLeft(int heights[]){
        int n = heights.length;
        int nsl[] = new int[n];
        Stack<Integer>stack = new Stack<>();
        for(int i =0; i<n;i++){
            while(!stack.isEmpty()&& heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
          nsl[i] = stack.isEmpty()?-1:stack.peek();
          stack.push(i);
        }
        return nsl;
       }
       private int[] nextSmallerRight(int heights[]){
         int n = heights.length;
        int nsr[] = new int[n];
        Stack<Integer>stack = new Stack<>();
        for(int i =n-1; i>=0;i--){
            while(!stack.isEmpty()&& heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
          nsr[i] = stack.isEmpty()? n :stack.peek();
          stack.push(i);
        }
        return nsr;
       }
    }

