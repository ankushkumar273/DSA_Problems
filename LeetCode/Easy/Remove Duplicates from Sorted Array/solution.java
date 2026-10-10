class Solution {
    public int removeDuplicates(int[] nums) {
      int n = nums.length;
      if(n == 0){
        return 0;
      }

      int temp []= new int[n];
      int k = 0;
      temp[k++] = nums[0];
      for(int i=1; i<nums.length; i++){
        if(nums[i] != nums[i-1]){
            temp[k++] = nums[i];
        }
        }
        for(int i=0; i<k; i++){
            nums[i] = temp[i];
      }
      return k;
    }  
}    