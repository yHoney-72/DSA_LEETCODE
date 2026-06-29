class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        Stack<Integer>stack = new Stack<>();
        for(int i = 0 ; i<n ; i++){
            char ch = s.charAt(i);
            if(ch=='('|| ch ==')'){
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    char top = s.charAt(stack.peek());
                    if(top=='('&& ch==')'){
                        stack.pop();
                    }else{
                        stack.push(i);
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder(s);
        while(!stack.isEmpty()){
            int index = stack.pop();
            sb.setCharAt(index,'#');
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i<n ; i++){
            if(sb.charAt(i)!='#'){
                ans.append(sb.charAt(i));
            }
        }
        return ans.toString();
    }
}