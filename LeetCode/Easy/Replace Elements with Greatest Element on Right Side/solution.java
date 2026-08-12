class Solution {
    public int[] replaceElements(int[] arr) {
        int l = arr.length;

        for(int i=0; i<l-1; i++){
            int max = arr[i+1];
            for(int j=i+2; j<l; j++){
                if(max < arr[j]){
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        arr[l-1] = -1;
        return arr;
    }
}