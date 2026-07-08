class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String>list = new ArrayList<>();
        char[] ch = s.toCharArray();
        BackTrace(ch , list, 0);
        return list;
    }
    private void BackTrace(char ch[], List<String>list , int index){
          if(index==ch.length){
              list.add(new String(ch));
           return ;
    }
         if(Character.isDigit(ch[index])){
            BackTrace(ch,list , index+1);
            return ;
         }
         ch[index] = Character.toLowerCase(ch[index]);
            BackTrace(ch, list, index+1);
         
         ch[index] = Character.toUpperCase(ch[index]);
            BackTrace(ch,list,index+1);
         
    }
   }