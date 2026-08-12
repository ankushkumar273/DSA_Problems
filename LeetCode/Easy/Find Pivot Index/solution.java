class Solution {
    public int pivotIndex(int[] arr) {
      int totalSum = 0;

      for(int i=0; i<arr.length; i++){
        totalSum = totalSum + arr[i];
      }  

      int leftSum = 0;
      for(int i=0; i<arr.length; i++){
        int currEle = arr[i];
        int rightSum = totalSum - leftSum - currEle;
        if(rightSum == leftSum){
            return i;
        }
        leftSum = leftSum + currEle;
      }
      return -1;
    }
}