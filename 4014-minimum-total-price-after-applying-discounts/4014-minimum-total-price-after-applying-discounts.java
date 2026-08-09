class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        double ans = 0;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i = prices.length-1;
        int j = discounts.length-1;
        while(i>=0&&j>=0){
           double res = (double)(prices[i]*(100-discounts[j]))/100;
            ans+=res;
            i--;
            j--;
        }
        while(i>=0){
            ans+=prices[i];
            i--;
        }
        return ans;
    }
}