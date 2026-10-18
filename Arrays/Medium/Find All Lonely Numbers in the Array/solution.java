class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> lonely = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            int curr = nums[i];
            int prifix = curr-1;
            int sufix = curr+1;
            
            boolean leftFound = false;
            boolean rightFound = false;
            boolean dublicate = false;

            if(i > 0 && nums[i - 1] == curr - 1){
                leftFound =  true;
            }
            if(i < nums.length - 1 && nums[i + 1] == curr + 1){
                rightFound =  true;
            }
            if(i < nums.length - 1 && curr == nums[i+1]){
                dublicate = true;
            }
            if(i > 0 && curr == nums[i-1]){
                dublicate = true;
            }

            if(!dublicate && !leftFound && !rightFound){
                lonely.add(curr);
            }
        }
        return lonely;
    }
}