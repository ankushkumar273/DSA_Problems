class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        int r = matrix.length;
        int c = matrix[0].length;

        int top = 0;
        int bottom = r-1;
        int left = 0;
        int right = c-1;
        
        int value = 1;

        while(left<=right && top<=bottom){
            for(int i=left; i<=right; i++){
                matrix[top][i] = value;
                value++;
            }
            top++;

            for(int j=top; j<=bottom; j++){
                matrix[j][right] = value;
                value++;
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    matrix[bottom][i] = value;
                    value++;
                }
                bottom--;
            }
            if(left<=right){
                for(int j=bottom; j>=top; j--){
                    matrix[j][left] = value;
                    value++;
                }
                left++;
            }
        }
        return matrix;
    }
}