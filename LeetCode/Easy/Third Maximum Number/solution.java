class Solution {
    public int thirdMax(int[] nums) {
       int n = nums.length;
       Arrays.sort(nums);
       int distinct = 1;

       for(int i=n-1; i>0; i--){
        if(nums[i] != nums[i-1]){
            distinct++;
        }

        if(distinct == 3){
            return nums[i-1];
        }
       } 
       return nums[n-1];
    }
}