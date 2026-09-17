class Solution {
    int search(int[] arr, int key) {
        // code here
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == key){
                return mid;
            }
            
            //left sort
            if(arr[start]<=arr[mid]){
            if(arr[start]<= key && arr[mid]>key){
                end = mid-1;
            }else{
                start = mid+1;
            }
               }
               else{
                   if(arr[mid]<key && key <= arr[end]){
                       start = mid+1;
                   }else {
                       end = mid-1;
                   }
               }
        }
        return -1;
    }
}