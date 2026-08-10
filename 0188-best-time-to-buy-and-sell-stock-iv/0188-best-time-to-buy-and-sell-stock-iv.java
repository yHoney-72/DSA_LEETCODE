class Solution {
    public int maxProfit(int k, int[] prices) {
     int buy[] = new int[k+1];
     int sell[] = new int[k+1];
      Arrays.fill(buy,Integer.MIN_VALUE);
      Arrays.fill(sell,0);
     for(int price:prices){
        for(int i = 1 ;i<=k;i++){
            buy[i] = Math.max(buy[i],sell[i-1]-price);
            sell[i]= Math.max(sell[i],price+buy[i]);
        }
     }
     return sell[k];
    
      }
    }
