class Solution {
    public List<Integer> partitionLabels(String s) {
     HashMap<Character,Integer>map = new HashMap<>();
     for(int i = 0 ; i<s.length();i++){
        char ch = s.charAt(i);
         map.put(ch,i);
     }
     int maxBoundary = 0;
     int start = 0 ;
     List<Integer>list = new ArrayList<>();
     for(int i = 0 ; i<s.length();i++){
        char ch = s.charAt(i);
        int value = map.get(ch);
        maxBoundary = Math.max(maxBoundary,value);
        if(maxBoundary==i){
            list.add(i-start+1);
            start = i+1;
        }
       }
       return list;
     }
}