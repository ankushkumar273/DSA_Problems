class Solution {
    public boolean isValid(int n, int[] quantities, long mid){
        int store = 0;

        for(int i=0; i<quantities.length; i++){
            store+= (quantities[i]+mid-1)/mid;

            if(store>n){
                return false;
            }
        }
        return true;
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int x = quantities.length;
        
        int max = 0;
        for(int i=0; i<x; i++){
            max = Math.max(max,quantities[i]);
        }

        long ans = -1;
        long st = 1;
        long end = max;

        while(st <= end){
            long mid = st+(end-st)/2;
            if(isValid(n, quantities, mid)){
                ans = mid;
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return (int)ans;
    }
}