class Solution {
    public int[] sortEvenOdd(int[] nums) {

        //step1 for arrange in dec odd idx
        for(int i=1; i<nums.length; i+=2){
            for(int j=i+2; j<nums.length; j+=2){
                if(nums[i] < nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }

        //step2 for arrange in acc even idx
        for(int i=0; i<nums.length; i+=2){
            for(int j=i+2; j<nums.length; j+=2){
                if(nums[i] > nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }
}