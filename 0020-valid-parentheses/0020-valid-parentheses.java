class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty()){
            return true;
        }
        Stack<Character>stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            }else {
                if(stack.isEmpty()|| stack.pop()!=ch){
                    return false;
                }
            }
          
        }
         if(!stack.isEmpty()){
            return false;
           }
        return true;
    }
}