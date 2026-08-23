import java.util.Arrays;
class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int pivot=0;
       int pivotIndex=-1;
        for(int i =n-1;i>=1;i--){
          if(arr[i-1]<arr[i]){
            pivot = arr[i-1];
            pivotIndex = i-1;
            break;
          }
        }
        if(pivotIndex ==-1){
            Arrays.sort(arr,0,n);
            return ;
        }
        int min = Integer.MAX_VALUE;
        int minIndex =-1;
        for(int i = n-1; i>pivotIndex;i--){
           if (arr[i] > pivot && arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[minIndex];
        arr[minIndex] = temp;
        Arrays.sort(arr,pivotIndex+1,n);
    }
}

