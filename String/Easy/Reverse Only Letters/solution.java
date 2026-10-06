class Solution {
    public String reverseOnlyLetters(String s) {
        String rev = "";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                rev = s.charAt(i) + rev;
            }
        }

        for(int i=0; i<s.length(); i++){
            if(!Character.isLetter(s.charAt(i))){
                rev = rev.substring(0,i) + s.charAt(i) + rev.substring(i);
                }
            }
        return rev;
    }
}