class Solution {
    public boolean checkInclusion(String s1, String s2) {
     int n = s1.length();
     int m = s2.length();
     int count1[] = new int[26];
     int count2[] = new int[26];
     if(n>m){
        return false;
     }
     for(int i =0;i<n;i++){
        count1[s1.charAt(i)-'a']++;
        count2[s2.charAt(i)-'a']++;
     }
     if(Arrays.equals(count1,count2)){
        return true;
     }
     int j =0;
     for(int i=n;i<m;i++){
        count2[s2.charAt(i)-'a']++;
        count2[s2.charAt(j)-'a']--;
        if(Arrays.equals(count1,count2)){
            return true;
        }
        j++;
     }
     return false;
    }
 }
