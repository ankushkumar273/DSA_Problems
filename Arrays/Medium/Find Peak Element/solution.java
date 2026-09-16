class Solution {
    public int findPeakElement(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i-1]>nums[i]){
                continue;
            } 
            if(i<nums.length-1 && nums[i+1]>nums[i]){
                continue;
            }
            return i;
        }
        return -1;
    }
}