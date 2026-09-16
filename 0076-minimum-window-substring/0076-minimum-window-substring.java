class Solution {
    public String minWindow(String s, String t) {
      int mapS[] = new int[256];
      int mapT[] = new int[256];
      for(char ch: t.toCharArray()){
        mapT[ch]++;
      }
      int left =0, right= 0, minLength =Integer.MAX_VALUE, minStart =0;
      for(; right<s.length();right++){
           mapS[s.charAt(right)]++;
           while(contains(mapT,mapS)){
               if(right-left+1< minLength){
                   minLength = right-left+1;
                   minStart = left;
               }
               mapS[s.charAt(left++)]--;
           }
      }
        return minLength ==Integer.MAX_VALUE?"":s.substring(minStart,minStart+minLength);
    }
    private boolean contains(int[] mapT,int mapS[]){
        for(int i=0;i<256;i++){
            if(mapT[i]>mapS[i]){
                return false;
            }
        }
            return true;
    }
}