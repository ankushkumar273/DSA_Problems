class Solution {
    int KthMissingElement(int arr[], int k) {
        // Code here
        int n = arr.length;
        int count = arr[0];
        int arr1[] = new int[k];
        int index = 0;
        for(int i=0; i<n; i++){
            while(count+1 < arr[i]){
             count++;
            arr1[index]  = count;
            index++;
            if(index == k){
            return arr1[k-1];
        }
            }
            count = arr[i];
            
        }
        return -1;
    }
}
