class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        int needleHash =0;
        if(m>n){
            return -1;
        }
       
        for(int i=0;i<m;i++){
            needleHash+=needle.charAt(i)-'a'+1;
        }
        int haystackHash = 0;
        for(int i=0;i<m;i++){
            haystackHash+=haystack.charAt(i)-'a'+1;
        }
        for(int i=0;i<=n-m;i++){
            if(needleHash==haystackHash){
                String window = haystack.substring(i,i+m);
                if(window.equals(needle)){
                    return i;
                }
            }
            if(i<n-m){
                int add = haystack.charAt(i+m)-'a'+1;
                int remove = haystack.charAt(i)-'a'+1;
                haystackHash+=add-remove;
            }
        }
        return -1;
    }
}