class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int result[] = new int[nums.length];
        int evenIndx = 0;
        int oddIndx = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                result[evenIndx] = nums[i];
                evenIndx +=2;
            }else{
                result[oddIndx] = nums[i];
                oddIndx +=2;
            }
        }
        return result;
    }
}