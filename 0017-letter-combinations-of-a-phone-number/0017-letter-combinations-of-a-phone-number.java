class Solution {
    String[] map = {"", "", "abc", "def", "ghi","jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
       List<String>result = new ArrayList<>();
       if(digits==null|| digits.length()==0){
            return result;
        }
        BackTrace("",result,digits,0);
        return result;
    }
    private void BackTrace(String current , List<String>result,String digits , int index){
        if(index==digits.length()){
            result.add(current);
            return; 
        }
        char ch = digits.charAt(index);
        String letter = map[ch-'0'];
      
        for(int i = 0 ; i<letter.length(); i++){
            BackTrace(current+letter.charAt(i),result,digits,index+1);
        }
    }
  
}