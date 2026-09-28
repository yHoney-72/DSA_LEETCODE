class Solution {
    public List<List<String>> partition(String s) {
     List<String>list = new ArrayList<>();
     List<List<String>>result = new ArrayList<>();
     String t = "";
     helper(list,result,s,0,"");
     return result;
   }
   private void helper(List<String>list,List<List<String>>result,String s , int index , String t){
       if(index==s.length()){
         result.add(new ArrayList<>(list));
         return ;
       }
       for(int i = index; i<s.length();i++){
          t+=String.valueOf(s.charAt(i));
          if(checker(t,0,t.length()-1)){
            list.add(t);
            helper(list,result,s,i+1,"");
            list.remove(list.size()-1);
          }
       }
   }
   private boolean checker(String t , int left , int right){
    if(left>=right){
        return true;
    }
    if(t.charAt(left)!=t.charAt(right)){
        return false;
    }
     return checker(t,left+1,right-1);
   }
   
}