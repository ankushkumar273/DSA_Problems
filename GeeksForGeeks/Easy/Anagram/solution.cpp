class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        int fre[] = new int[26];
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i=0; i<s1.length(); i++){
           fre[s1.charAt(i) - 'a']++; 
        }
        for(int i=0; i<s2.length(); i++){
            fre[s2.charAt(i) - 'a']--;
        }
        for(int i =0; i<fre.length; i++){
            if(fre[i] != 0){
                return false;
            }
        }
        return true;
    }
}