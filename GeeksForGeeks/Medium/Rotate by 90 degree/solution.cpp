class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        int r = mat.length;
        int c = mat[0].length;
        
        for(int i=0; i<r; i++){
            for(int j=i+1; j<c; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int i = 0; i < r / 2; i++){
                int[] temp = mat[i];
                mat[i] = mat[r - 1 - i];
                mat[r - 1 - i] = temp;
            }
        }
}