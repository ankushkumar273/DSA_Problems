class Solution {
    public String reverseWords(String s) {
       String result = "";
        int end = s.length() - 1;

        for(int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            if(ch == ' ') {

                if(i < end) {
                    String str = s.substring(i + 1, end + 1);

                    if(result.length() == 0) {
                        result += str;
                    } else {
                        result += " " + str;
                    }
                }

                end = i - 1;
            }
        }

        if(end >= 0) {
            String str = s.substring(0, end + 1);

            if(str.length() > 0) {
                if(result.length() == 0) {
                    result += str;
                } else {
                    result += " " + str;
                }
            }
        }

        return result; 
    }
}