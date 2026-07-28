class Solution {
    public int maximumSwap(int num) {
      char arr[] = String.valueOf(num).toCharArray();
      int rightswap =-1;
      int leftswap =-1;
      int maxIndex = arr.length-1;
      for(int i = arr.length-1 ; i>=0;i--){
        if(arr[i]>arr[maxIndex]){
            maxIndex = i;
        }else if(arr[i]<arr[maxIndex]){
          leftswap = i;
          rightswap = maxIndex;

        }
      }
      if(leftswap !=-1){
        char temp =arr[leftswap];
        arr[leftswap] = arr[rightswap];
        arr[rightswap] = temp; 
      }
      return Integer.parseInt(new String (arr));
    }
}