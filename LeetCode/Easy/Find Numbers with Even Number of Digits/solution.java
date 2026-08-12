class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for(int n:nums){
            String s1 = n+"";
            int l = s1.length();
            if(l%2 == 0){
                count++;
            }
        }
        return count;
    }
}