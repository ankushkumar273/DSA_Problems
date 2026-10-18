class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        int answer = 0;
        for(int i=0; i<nums.length-1; i++){
            if(key == nums[i]){
                int target = nums[i+1];

                map.put(target, map.getOrDefault(target,0)+1);
                if(map.get(target)>maxCount){
                    maxCount = map.get(target);
                    answer = target;
                }
            }
        }
        return answer;
    }
}