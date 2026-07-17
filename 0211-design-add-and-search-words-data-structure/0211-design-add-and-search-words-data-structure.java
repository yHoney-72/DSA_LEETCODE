class WordDictionary {
    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode current = root;
        for(int i = 0 ;i<word.length();i++){
            int index = word.charAt(i)-'a';
            if(current.children[index]==null){
                current.children[index]= new TrieNode();
            }
            current = current.children[index];
        }
       current.isEnd = true;
    }
    
    public boolean search(String word) {
      return   fun(word,0,root);
    }
    private boolean fun(String word , int index , TrieNode current){
        if(current==null){
            return false;
        }
        if(index==word.length()){
            return current.isEnd;
        }
        char ch = word.charAt(index);
        if(ch == '.'){
            for(int i = 0; i<26; i++){
                if(current.children[i]!=null && fun(word,index+1,current.children[i])){
                    return true ;
                }
            }
                return false ;
        }
        int childIndex = ch -'a';
        return fun(word,index+1,current.children[childIndex]);
    }
}
class TrieNode{
    TrieNode[]children;
    boolean isEnd;
    TrieNode(){
        children = new TrieNode[26];
        for(int i = 0 ; i<26; i++){
            children[i]= null;
        }
        isEnd = false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */