class Solution {
      long MOD = 1000000007;
    public int countGoodNumbers(long n) {
        long evenCount = (n+1)/2;
        long oddCount = n/2;
        long evenWays= power(5,evenCount);
        long oddWays = power(4,oddCount);
        return (int)((evenWays*oddWays)%MOD); 
        
    }
    private long power(long base , long exp){
        if(exp==0){
            return 1;
        }
        long half = power(base,exp/2);
        long ans = (half*half)%MOD;
        if(exp%2==0){
            return ans;
        }else{
            return (base*ans)%MOD;
        }

    }
}