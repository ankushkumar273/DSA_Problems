class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(nums[mid]==target){
                return mid;
        }

        //check left is sorted?
        if(nums[start]<=nums[mid]){
            //check target in reange?
            if(nums[start]<=target && nums[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }else{
            //check taregt in reange?
            if(nums[mid]<target && nums[end]>=target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        }
        return -1;
    }
}