class Solution {
    public String reorganizeString(String s) {
        int n = s.length();
        int freq[] = new int [26];
        for(int i = 0 ; i<n ; i++){
            freq[s.charAt(i)-'a']++;
        }
        PriorityQueue<Node>pq = new PriorityQueue<>((a,b)->b.fre-a.fre);
        for(int i = 0 ; i<26 ; i++){
            if(freq[i]>0){
                pq.offer(new Node (freq[i],(char)(i+'a')));
            }
        }
        StringBuilder ans = new StringBuilder();
        Node prev = null;
        while(!pq.isEmpty()){
            Node curr = pq.poll();
            curr.fre--;
            ans.append(curr.ch);
            if(prev!=null&& prev.fre>0){
                pq.offer(prev);
            }
             prev = curr;
        }
        if(ans.length()!=n){
            return "";
        }
   return ans.toString();
    }

}
class Node{
    int fre;
    char ch;
    Node(int fre, char ch){
        this.fre = fre;
        this.ch = ch;
    }
}