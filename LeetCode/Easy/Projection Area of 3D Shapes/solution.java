class Solution {
    public int projectionArea(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        
        
        int total_projection = 0;
        // top projection
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(grid[i][j] > 0){
                    total_projection++;
                }
            }
        }
        // row projection
        for(int i=0; i<r; i++){
            int RMax = 0;
            for(int j=0; j<c; j++){
                RMax = Math.max(grid[i][j], RMax);
            }
            total_projection += RMax;
        }
        //col projection
        for(int j=0; j<c; j++){
            int CMax = 0;
            for(int i=0; i<r; i++){
                CMax = Math.max(grid[i][j], CMax);
            }
            total_projection += CMax;
        }
        
        return total_projection;
    }
}