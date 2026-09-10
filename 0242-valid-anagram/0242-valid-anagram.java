class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n!=m){
            return false;
        }
        int count1[] = new int[26];
        int count2[] = new int[26];
        for(int i =0;i<n;i++){
            count1[s.charAt(i)-'a']++;
            count2[t.charAt(i)-'a']++;
        }
        if(Arrays.equals(count1,count2)){
            return true;
        }
        return false;
    }
}