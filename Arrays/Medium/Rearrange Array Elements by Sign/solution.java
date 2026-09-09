class Solution {
    public int[] rearrangeArray(int[] nums) {
      int n = nums.length/2;
      int positive[] = new int[n];
      int negative[] = new int[n];

      int posIndx = 0;
      int negIndx = 0;
      for(int i=0; i<nums.length; i++){
        if(nums[i] > 0){
            positive[posIndx++] = nums[i];
        }else{
            negative[negIndx++] = nums[i];
        }
      }

      int result[] = new int[nums.length];
      int indx = 0;
      for(int i=0; i<positive.length; i++){
        result[indx++] = positive[i];

        result[indx++] = negative[i];
      }
      for(int i=0; i<result.length; i++){
        nums[i] = result[i]; 
      }
       return nums;
    }
}