class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int required = target - nums[i];

            if(map.containsKey(required)){
                result[0] = map.get(required);
                result[1] = i;
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
        
    }
}