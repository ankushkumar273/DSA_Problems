class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        
        
        for(int i=0; i<nums.length-3; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j=i+1; j<nums.length-2; j++){
                if(j> i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                int p = j+1;
                int q = nums.length-1;
                while(p < q){
                    long sum = (long) nums[i] + nums[j] + nums[p] + nums[q];
                    ArrayList<Integer> temp = new ArrayList<>();
                    if(sum < target){
                        p++;
                    }else if(sum > target){
                        q--;
                    }else {
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[p]);
                        temp.add(nums[q]);
                        p++;
                        q--;
                         result.add(temp);
                        while (p < q && nums[p] == nums[p - 1]) {
                            p++;
                        }

                        while (p < q && nums[q] == nums[q + 1]) {
                            q--;
                        }
                    }
                }
            }
        }
        return result;
    }
}