class Solution {
    public int majorityElement(int[] nums) {
        int l= nums.length;
        for( int i=0; i<l; i++){
            int c = 0;

            for(int j=0; j<l; j++){
                if(nums[i] == nums[j]){
                    c++;
                }
            }
            if(c > (l/2)){
                return nums[i];
            }
        }
        return -1;
    }
}