class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        int l = 0;
        int r = arr.length-1;
        while(l <= r){
            int mid = (l+r)/2;
            if(arr[mid] == k){
                return true;
            }else if(k < arr[mid]){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return false;
    }
}