class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder s1 = new StringBuilder();
        for(char ch: s.toCharArray()){
          if(Character.isLetterOrDigit(ch)){
            s1.append(ch);
          }
        }
       for(int i=0;i<s1.length()/2;i++){
        if(s1.charAt(i)!=s1.charAt(s1.length()-i-1)){
            return false;
        }
       }
       return true;
    }
}