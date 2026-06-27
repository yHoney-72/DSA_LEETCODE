class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer>stack = new Stack<>();
       int sum = 0;
       for(String i : operations){
     if("C".equals(i)){
             int score =stack.pop();
             sum = sum-score;
        }else if("+".equals(i)){
           int m = stack.pop();
           int n = stack.peek();
           stack.push(m);
           int score =stack.push(m+n);
           sum+=score; 
        }else if("D".equals(i)){
          int z = 2*stack.peek();
          stack.push(z);
           sum+= z;
        }else{
         int score=   stack.push(Integer.parseInt(i));
            sum+=score;
        }
       } 
       return sum ;
    }
}