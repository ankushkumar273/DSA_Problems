class Solution {
    public String longestPrefix(String s) {
        int n = s.length();

        int[] lps = new int[n];

        int length = 0;
        int i = 1;

        while(i < n) {

            if(s.charAt(i) == s.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            }
            else {

                if(length != 0) {
                    length = lps[length - 1];
                }
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        int longestLength = lps[n - 1];

        return s.substring(0, longestLength);
    }
}