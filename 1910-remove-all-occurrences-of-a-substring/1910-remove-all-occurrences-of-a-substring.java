class Solution {
    public String removeOccurrences(String s, String part) {
       StringBuilder result = new StringBuilder();
       for(char ch: s.toCharArray()){
        result.append(ch);
        if(result.length()>=part.length()){
            int st = result.length()-part.length();
            boolean matched = true;
            for(int i=0;i<part.length();i++){
                if(result.charAt(st+i)!=part.charAt(i)){
                    matched = false;
                    break;
                }
            }
            if(matched){
                result.delete(st,result.length());
       }
        }
       }
       return result.toString();
       
    }
}