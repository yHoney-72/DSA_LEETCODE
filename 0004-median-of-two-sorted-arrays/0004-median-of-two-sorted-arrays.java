class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
       int arr[] = new int[n+m];
       for (int i = 0; i < n; i++) {
            arr[i] = nums1[i];
        }
       for (int i = 0; i < m; i++) {
            arr[n + i] = nums2[i];
        }
       int z = arr.length;
       Arrays.sort(arr);
       if(z%2==0){
        return  (arr[z/2]+arr[z/2-1])/2.0;
       }else{
        return  arr[(z-1)/2];
       }
    }
}