class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int max = 0;
         for(int x: quantities){
           max = Math.max(x,max);
         }
         int low =1, high = max;
         while(low<=high){
            int mid = low+(high-low)/2;
            int storeneed =0;
            for(int q:quantities){
                storeneed+=((q+mid-1)/mid);
            }
            if(storeneed<=n){
                high = mid-1;
            }else{
                low = mid+1;
            }
         }
         return low;
        }
    }
