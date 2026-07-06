class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>result = new ArrayList<>();
        List<Integer>current = new ArrayList<>();
        BackTrace(current , result , k , n , 1);
           return result ;
    }
    private void BackTrace(List<Integer>current , List<List<Integer>>result , int k , int n ,int index){
        if(current.size()==k){
            if(n==0){
            result.add(new ArrayList<>(current));
            }
            return ;
        }
        if(n<0){
            return ;
        }
        for(int i = index ;i<=9; i++){
            current.add(i);
            BackTrace(current,result,k,n-i, i+1);
            current.remove(current.size()-1);
        }
    }
}