class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack = new Stack<>();
        for(String token: tokens){
            if(token.equals("+")||token.equals("-")||token.equals("/")||token.equals("*")){
                int a = stack.pop();
                int b = stack.pop();
                int ans = cal(b,a,token);
                stack.push(ans);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
       private  int cal(int a, int b, String token) {
        switch (token) {
             case "+":
                 return a + b;
             case "-":
                 return a - b;
             case "*":
                 return a * b;
             case "/":
                 return a / b;
             default:
                 return 0;
    }
}
    
}