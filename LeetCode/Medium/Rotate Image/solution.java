class Solution {
    public void rotate(int[][] matrix) {
      int r = matrix.length;
      int c = matrix[0].length;
      int ans[][] = new int[r][c];
      for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){

            ans[j][(r-1)-i] = matrix[i][j]; 
        }
      }
      for(int i=0; i<ans.length; i++){
        for(int j=0; j<ans[0].length; j++){
            matrix[i][j] = ans[i][j];
        }
      }
      return;

    }
}