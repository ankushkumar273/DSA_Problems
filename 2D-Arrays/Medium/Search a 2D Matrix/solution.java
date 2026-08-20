class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int left = 0;
        int right = r*c-1;

        while(left<=right){
            int mid = (left+right)/2;
            int val = matrix[mid/c][mid%c];
            if(val == target){
                return true;
            }
            else if(val < target){
                left = mid+1; 
        }else {
            right = mid -1;
        }
        }
        return false;
    }
}