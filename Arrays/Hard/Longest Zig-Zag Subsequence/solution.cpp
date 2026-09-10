class Solution {
    public int longestZigZag(int[] arr) {
        // code here
        int up = 1;
        int dwon = 1;
        
        for(int i=1; i<arr.length; i++){
            if(arr[i] > arr[i-1]){
                up = dwon +1;
            }
            else if(arr[i] < arr[i-1]){
                dwon = up +1;
            }
        }
        return Math.max(up, dwon);
    }
}