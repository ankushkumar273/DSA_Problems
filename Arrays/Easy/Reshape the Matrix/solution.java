class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        int t[][] = new int[r][c];
        if(m*n != r*c){
            return mat;
        }

        int row=0;
        int col=0;

        int oldRow = 0;
        int oldCol = 0;
        for(int i=0; i<m*n; i++){
            t[row][col] = mat[oldRow][oldCol];

            //Move new Matrix
            col++;
        if(col==c){
             col = 0;
             row++;
            }

            // Move in old Matrix
            oldCol++;
            if(oldCol == n){
                oldCol = 0;
                oldRow++;
            }
        }
        return t;
    }
}