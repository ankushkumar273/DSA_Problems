class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length;
        int i = 0;
        int count = 1;
        Arrays.sort(arr);
        while(i<n){
           if(arr[i] == count){
               i++;
               count++;
           } 
           else{
               return count;
           }
        }
        return count;
    }
}