class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        for(int i = 1; i<=n; i++){
            int multiple = k*i;
            boolean found = false;
            for(int j=0; j<n; j++){
                if(multiple == nums[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                return multiple;
            }
        }
        return k*(n+1);
    }
}