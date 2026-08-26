class Solution {
    public static int largest(int[] arr) {
        // code here
        int l =arr.length;
        int largest = 0;
        for(int i=0; i<l; i++) {
        
           if(arr[i] > largest){
               largest = arr[i];
           } 
        } 
        return largest;
    }
}
