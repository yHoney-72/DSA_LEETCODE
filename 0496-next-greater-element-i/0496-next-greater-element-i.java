class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = nextGreater(nums1[i],nums2);
           }
        return arr;
        }
    
    private int nextGreater(int target,int nums2[]){
        int n = nums2.length;
        boolean finder = false;
        int index = 0;
        for(int i=0;i<n;i++){
            if(target==nums2[i]){
                finder = true;
                index =i;
                break;
            }
        }
        if(finder==false){
            return -1;
        }
        for(int i=index+1;i<n;i++){
            if(nums2[i]>target){
                return nums2[i];
            }
        }
        return -1;
    }
  
}