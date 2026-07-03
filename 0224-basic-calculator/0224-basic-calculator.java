class Solution {
    public int calculate(String s) {
    Stack<Integer>stack = new Stack<>();
    int result = 0 ;
    int sign = 1;
    int num = 0;
    for(int i = 0 ; i<s.length(); i++){
        char ch = s.charAt(i);
        if(Character.isDigit(ch)){
            num = num*10+(ch-'0');
        }else if (ch=='+'){
            result+=num*sign;
            sign = 1;
            num = 0;
        }else if(ch == '-'){
            result+=num*sign;
            sign = -1;
            num = 0;
        }else if(ch =='('){
            stack.push(result);
            stack.push(sign);
            result = 0;
            sign = 1;
        }else if (ch ==')'){
            result+=num*sign;
            num = 0;
            result*=stack.pop();
            result+=stack.pop();
        }else if(ch ==' '){
            continue;
        }
    }
        result+=num*sign;
        return result;
    }
}