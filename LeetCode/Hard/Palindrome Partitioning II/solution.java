class Solution {
    public int minCut(String s) {
        int dp[] = new int[s.length()];
        Arrays.fill(dp, -1);
        return solve(0, s, dp) -1;
    }
    public int solve(int index, String s, int dp[]){

        //Base case 
        if(index == s.length()){
            return 0;
        }
        if(dp[index] != -1){
            return dp[index];
        }
        int minCuts = Integer.MAX_VALUE;
        for(int i=index; i<s.length(); i++){
            String str = s.substring(index , i+1);
            if(isSafe(str)){
                int cuts = 1 + solve(i+1, s, dp);
                minCuts = Math.min(minCuts, cuts);
            }
        }
        return dp[index] = minCuts;
    }
    public boolean isSafe(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}