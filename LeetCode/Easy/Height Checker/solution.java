class Solution {
    public int heightChecker(int[] heights) {
       int l = heights.length;

        int expected[] = heights.clone();
        Arrays.sort(expected);
        int count = 0;
        for(int i=0; i<l; i++){
            if(heights[i] != expected[i]){
                count ++;
            }
        }
        return count;
    }
}