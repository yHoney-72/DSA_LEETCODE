class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer>list = new ArrayList<>();
        int total = n*m;
        int count = 0;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;
        while(count<total){
          for(int j =left;j<=right &&count<total;j++){
            list.add(matrix[top][j]);
            count++;
          }
          top++;
          for(int i=top;i<=bottom &&count<total;i++){
            list.add(matrix[i][right]);
            count++;
          }
          right--;
          for(int j=right;j>=left &&count<total ;j--){
           list.add(matrix[bottom][j]);
           count++;
          }
          bottom--;
          for(int i=bottom;i>=top &&count<total ;i--){
            list.add(matrix[i][left]);
            count++;
          }
          left++;
        }
        return list;
    }
}