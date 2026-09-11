class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        int pivot = -1;
        for(int i=n-2; i>=0; i--){
           if(arr[i] < arr[i+1]){
               pivot = i;
               break;
           } 
        }
        if(pivot == -1){
            Arrays.sort(arr);
            return;
        }
        
        for(int i=n-1; i>pivot; i--){
            if(arr[i] > arr[pivot]){
                int t = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = t;
                break;
            }
        }
        
        int i = pivot+1;
        int j = n-1;
        while(i<j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }
}