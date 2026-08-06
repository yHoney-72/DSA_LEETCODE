class Solution {
    static class State{
        int pos;
        boolean canBack;
        State(int pos,boolean canBack){
            this.pos = pos;
            this.canBack = canBack;
        }
    }
    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        Set<Integer>forbiddenSet = new HashSet<>();
        for(int f: forbidden){
            forbiddenSet.add(f);
        }
        Queue<State>que = new ArrayDeque<>();
        Set<String>visited = new HashSet<>();
        que.offer(new State(0,true));
        visited.add("0,true");
        int jumps = 0 ;
        int max = x;
        for(int f: forbidden){
          max = Math.max(max,f);
        }
        int limit = max+a+b;
        while(!que.isEmpty()){
            int size = que.size();
            for(int i = 0 ;i<size;i++){
                State curr = que.poll();
                if(curr.pos==x){
                    return jumps;
                }
                int forwardGo = curr.pos+a;
                if(forwardGo<=limit&&!forbiddenSet.contains(forwardGo)&&!visited.contains(forwardGo+",true")){
                    que.offer(new State(forwardGo,true));
                    visited.add(forwardGo+",true");
                }
                int backwardGo = curr.pos-b;
                if(backwardGo>=0&&curr.canBack==true&&!forbiddenSet.contains(backwardGo)&&!visited.contains(backwardGo+",false")){
                    que.offer(new State(backwardGo,false));
                    visited.add(backwardGo+",false");
                }
            }
            jumps++;
        }
        return -1;
    }
}