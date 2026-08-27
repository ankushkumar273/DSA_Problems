class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int secondLargest = -1;
        
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=n-2; i>=0; i--){
            if(arr[i] != arr[n-1]){
                secondLargest = arr[i];
                break;
            }
        }
        return secondLargest;
    }
}