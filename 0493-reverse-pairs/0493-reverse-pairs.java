class Solution {
   public int reversePairs(int[] nums) {
      if(nums.length<2||nums==null){
        return 0;
      }
        return merge(nums,0,nums.length-1);
   }  
     private int merge(int nums[], int low , int high){
        if(low>=high){
            return 0 ;
        }
          int mid = low+(high-low)/2;
          return  merge(nums,low,mid)+merge(nums,mid+1,high)+mergeSort(nums,low,mid,high);
           
     }
   private int mergeSort(int nums[], int low, int mid, int high){
     int count = 0;
     int j = mid+1;
     for(int i=low;i<=mid;i++){
        while(j <= high && (long)nums[i] > 2L * nums[j]){
            j++;
        }
        count+=j-(mid+1);
     }
     int temp[] = new int[high-low+1];
     int k =0;
     int i=low; 
     j= mid+1;
     while(i<=mid&&j<=high){
        temp[k++]= (nums[i]<=nums[j])?nums[i++]:nums[j++];
     }
     while(i<=mid){
        temp[k++]=nums[i++];
     }while(j<=high){
        temp[k++] = nums[j++];
     }
     System.arraycopy(temp, 0, nums, low, temp.length);
     return count;
   }
}