class Solution {
    public int peakElement(int[] arr) {
        // code here
        for(int i=0; i<arr.length; i++){
            if(i>0 && arr[i-1]> arr[i]){
                continue;
            }
            if(i<arr.length-1 && arr[i+1]> arr[i]){
                continue;
            }
            return i;
        }
        return -1;
    }
}
