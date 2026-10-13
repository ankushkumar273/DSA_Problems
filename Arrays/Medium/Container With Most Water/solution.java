class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;

        int p = 0;
        int q = height.length-1;

        while(p<q){
            int width = q-p;
            int heights = Math.min(height[p], height[q]);
            int water = width*heights;
            maxWater = Math.max(water, maxWater);
            if(height[p] > height[q]){
                q--;
            }else{
                p++;
            }
        }
        return maxWater;
    }
}