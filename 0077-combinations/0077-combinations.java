class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>result = new ArrayList<>();
        List<Integer>current = new ArrayList<>();
        boolean[]used = new boolean[n+1];
        callFun(result,n , k , current,used , 1);
        return result;
    }
    private void callFun(List<List<Integer>>result,int n,int k,List<Integer>current,boolean[] used,int start){
        if(current.size()==k){
             result.add(new ArrayList<>(current));
             return;
        }
       for(int i = start ; i<=n;i++){
        if(used[i]==true){
            continue;
        }
        current.add(i);
         used[i] = true;
         callFun(result , n , k , current,used,i+1);
         current.remove(current.size() - 1); 
          used[i] = false;
       }
        }
    }

    // start ek pointer hai jo har recursive call me aage badhta hai,
// taaki piche wale elements dobara consider na ho.
