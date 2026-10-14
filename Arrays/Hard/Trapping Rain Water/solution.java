class Solution {
    public int trap(int[] height) {
        int n = height.length;

        //find leftmax
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }

        //find rightmax
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(rightmax[i+1], height[i]);
        }

        //find trapedwater
        int totalWater = 0;
        for(int i=0; i<n; i++){
            int trapedwater = Math.max(0,Math.min(leftmax[i], rightmax[i])-height[i]);
            totalWater = totalWater + trapedwater;
        }
        return totalWater;
    }
}