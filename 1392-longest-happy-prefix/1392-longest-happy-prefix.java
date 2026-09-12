class Solution {
    public String longestPrefix(String s) {
       int n = s.length();
       int lps[] = new int[n];
       int i =1;
       int len =0;
       while(i<n){
        if(s.charAt(i)==s.charAt(len)){
            lps[i++]=++len;
        }else{
            if(len==0){
                lps[i++]=0;
            }else{
                len = lps[len-1];
            }
        }
       }
       return s.substring(0,lps[n-1]);
  }
}