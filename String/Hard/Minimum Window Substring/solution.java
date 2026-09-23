class Solution {
    public String minWindow(String s, String t) {
        int left = 0;
        int right = 0;

        int[] need = new int[128];
        int[] window = new int[128];

        // Count characters required from t
        for (int i = 0; i < t.length(); i++) {
            need[t.charAt(i)]++;
        }

        int required = t.length();
        int minLength = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {

            // Current character
            char current = s.charAt(right);

            // Add current character to window
            window[current]++;

            // If current character was required
            if (window[current] <= need[current]) {
                required--;
            }

            // Window is valid
            while (required == 0) {

                // Save smallest window
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                // Remove left character
                char remove = s.charAt(left);
                window[remove]--;

                if (window[remove] < need[remove]) {
                    required++;
                }

                left++;
            }

            right++;
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLength);
    }
}