class Solution {
    public String largestOddNumber(String num) {
        int maxOdd = 0;
        for(int i=num.length()-1; i>=0; i--){
            char ch= num.charAt(i);
            int digit = ch - '0';
            if(digit%2 != 0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}