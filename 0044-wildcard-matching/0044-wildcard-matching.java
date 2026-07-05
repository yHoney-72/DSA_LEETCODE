class Solution {
    public boolean isMatch(String s, String p) {
        int s1 = 0 ;
        int p1 = 0 ;
        int starPos = -1;
        int backup =-1;
        while(s1<s.length()){
            if(p1<p.length()&&(p.charAt(p1)==s.charAt(s1)||p.charAt(p1)=='?')){
                s1++;
                p1++;
            }else if(p1<p.length()&& p.charAt(p1)=='*'){
                starPos = p1;
                backup = s1;
                p1++;
            }else if(starPos!=-1){
                p1 = starPos+1;
                backup++;
                s1= backup;
            }else{
                return false;
            }
        }
        while(p1<p.length()&&p.charAt(p1)=='*'){
            p1++;
        }
        return p1==p.length();
    }
}