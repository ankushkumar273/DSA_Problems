class Solution {
    static int nthFibonacci(int n) {
        // code here
        if(n == 0 || n == 1){
            return n;
        }
        
        int prev = 0;
        int curr = 1;
        for(int i=2; i<=n; i++){
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }
}