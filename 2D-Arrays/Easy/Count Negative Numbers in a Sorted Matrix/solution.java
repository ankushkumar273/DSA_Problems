class Solution {
    public int countNegatives(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int count = 0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(grid[i][j] < 0){
                    count++;
                }
            }
        }
        return count;
    }
}