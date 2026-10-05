class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans = new ArrayList<>();

        int r = grid.length;
        int c = grid[0].length;

        int total = r*c;
        k = k%total;

        for(int i=0; i<r; i++){
            ans.add(new ArrayList<>());
            for(int j=0; j<c; j++){
                ans.get(i).add(0);
            }
        }

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                int oldIndex = i*c+j;
                int newIndex = (oldIndex+k) % total;
                int newrow = newIndex/c;
                int newcol = newIndex%c;

                ans.get(newrow).set(newcol , grid[i][j]);
            }
        }
        return ans;
    }
}