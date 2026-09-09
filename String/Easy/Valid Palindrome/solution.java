class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for(int i=0; i<s.length(); i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
                str = str + ch;
            }
        }
        String rev = "";
        for(int i=0; i<str.length(); i++){
            rev = str.charAt(i) + rev;
        }
        if(str.equals(rev)){
            return true;
        }else{
            return false;
        }
    }
}