class Solution {
    public long maxPairStrength(int[] nums) {
        long max = Integer.MIN_VALUE;
        for(int i = 0 ; i<nums.length;i++){
            for(int j = i+1; j<nums.length;j++){
              long ans = 1L*nums[i]*nums[j];
                long g = gcd(nums[i],nums[j]);
                long product = ans/(g*g);
               
                max = Math.max(product,max);
            }
        }
        return max;
    }
    private long gcd(long a ,long b){
        while(b!=0){
            long temp = b;
            b = a%b;
            a = temp;
        }
        return a ;
    }
    }
