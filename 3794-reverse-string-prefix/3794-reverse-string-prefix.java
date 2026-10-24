class Solution {
    public String reversePrefix(String s, int k) {
        int n =s.length();
        StringBuilder sb = new StringBuilder(s);
        Stack<Character>stack = new Stack<>();
        for(int i=0;i<k;i++){
            stack.push(sb.charAt(i));
        }
        for(int i=0;i<k;i++){
            sb.setCharAt(i,stack.pop());
        }
        return sb.toString();
    }
}