class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String>map = new HashSet<>(wordList);
        if(!map.contains(endWord)){
            return 0 ;
        }
        if(beginWord.equals(endWord)){
         return 1;
        }
        Queue<String>que = new ArrayDeque<>();
          que.offer(beginWord);
         int count = 1;
          while(!que.isEmpty()){
            int size = que.size();
            for(int j = 0 ; j<size;j++){
                String word = que.poll();
                if(word.equals(endWord)){
                    return count ;
                }
                 StringBuilder sb = new StringBuilder(word);
                    for(int i = 0 ; i<word.length();i++){
                      char wordLetter = sb.charAt(i);
                        for(char ch = 'a';ch<='z';ch++){
                           sb.setCharAt(i,ch);
                           String newWord = sb.toString();
                           if(map.contains(newWord)){
                            que.offer(newWord);
                            map.remove(newWord);
                           }
                        }
                        sb.setCharAt(i,wordLetter);
                    }
                
            }
            count++;
          }
          return 0;
    }    
}