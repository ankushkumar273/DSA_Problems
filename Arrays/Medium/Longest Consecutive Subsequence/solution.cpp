class Solution {
    public int longestConsecutive(int[] arr) {
        // code here
        if(arr.length == 0){
            return 0;
        }
        
        Arrays.sort(arr);
        int count = 1;
        int maxLength = 1;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]+1 == arr[i+1]){
                count++;
            }else if(arr[i] == arr[i+1]){
                //kuch nahi karna hai
            }else{
                count = 1;
            }
            if(maxLength < count){
                maxLength = count;
            }
        }
        return maxLength;
    }
}