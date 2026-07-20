class Solution {
    public boolean canReach(int[] start, int[] target) {
      int ans =(int)(Math.pow((target[1]-start[1]),2)+Math.pow((target[0]-start[0]),2));
        if (ans%2==0){
            return true;
        }
        return false;
    }
}