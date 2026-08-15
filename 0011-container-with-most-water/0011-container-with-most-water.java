class Solution {
    public int maxArea(int[] height) {
        int width = 0 ;
        int h = 0 ;
        int area = 0 ;
        int maxArea = 0 ;
        int left = 0 , right = height.length-1;
        while(left<right){
            h= Math.min(height[left],height[right]);
            width = right-left;
            area = width*h;
            maxArea = Math.max(area,maxArea);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}