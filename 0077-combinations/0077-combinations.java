class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>result = new ArrayList<>();
        List<Integer>current = new ArrayList<>();
        callFun(result,n , k , current , 1);
        return result;
    }
    private void callFun(List<List<Integer>>result,int n,int k,List<Integer>current,int start){
        if(current.size()==k){
             result.add(new ArrayList<>(current));
             return;
        }
       for(int i = start ; i<=n;i++){
        current.add(i);
         callFun(result , n , k , current,i+1);
         current.remove(current.size() - 1); 
       }
        }
    }

    // start ek pointer hai jo har recursive call me aage badhta hai,
// taaki piche wale elements dobara consider na ho.
