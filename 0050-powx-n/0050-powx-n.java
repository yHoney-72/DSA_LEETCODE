class Solution {
    public double myPow(double x, int N) {
        long n = N; //for last test cas kyuki overflow ho rha 
        double ans = 1.0;
        if(n<0){
            x=1/x;
            n=-n;
        }
        while(n>0){
           if(n%2!=0){
            ans*=x;
            n--;
           }else{
            x*=x;
            n/=2;
           }
        }
        return ans;
    }
}