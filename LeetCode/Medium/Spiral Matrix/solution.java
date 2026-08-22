class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        List<Integer> mat = new ArrayList<>();
        int left = 0;
        int right = c-1;
        int top = 0;
        int bottom = r-1;

        while(left<=right && top<=bottom){
        for(int i=left; i<=right; i++){
            mat.add(matrix[top][i]);
        }
        top++;

        for(int j=top; j<=bottom; j++){
            mat.add(matrix[j][right]);
        }
        right--;

        if(top <= bottom){
        for(int i=right; i>=left; i--){
            mat.add(matrix[bottom][i]);
        }
           }
        bottom--;
        

        if(left <= right){
        for(int j=bottom; j>=top; j--) {
            mat.add(matrix[j][left]);
        }
           }
        left++;
           }
        return mat;
    }
}