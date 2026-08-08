class Solution {
    public int maxProfit(int[] prices) {
       int max = 0;
       int n = prices.length;
       int buy = prices[0];
       for(int i = 1 ;i<n;i++){
        if(buy>prices[i]){
            buy= prices[i];
        }else{
            max+=prices[i]-buy;
            if(i<n-1){
                buy=prices[i];
            }
        }
       } 
       return max;
    }
}