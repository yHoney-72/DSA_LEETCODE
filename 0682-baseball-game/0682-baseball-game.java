class Solution {
    public int calPoints(String[] operations) {
        Stack<String>stack = new Stack<>();
        int n = operations.length;
        for(String i : operations){
            if("+".equals(i)){
                int x = Integer.parseInt(stack.pop());
                int  y = Integer.parseInt(stack.peek());
                String z = String.valueOf(x+y);
                 stack.push(String.valueOf(x));
                String.valueOf(stack.push(z));
              
            }else if ("D".equals(i)){
                int z = Integer.parseInt(stack.peek());
                String  m = String.valueOf(2*z); 
                 stack.push(m);
            }else if ("C".equals(i)){
              stack.pop();
            }else{
                stack.push(i);
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            int x = Integer.parseInt(stack.pop());
        sum += x;
         }
return sum;
    }
}