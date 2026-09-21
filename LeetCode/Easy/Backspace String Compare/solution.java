class Solution {
    public boolean backspaceCompare(String s, String t) {
        String final1 = "";
        String final2 = "";

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '#'){
                if(final1.length() > 0){
                final1 = final1.substring(0, final1.length() -1);
                }
            }else {
                final1 = final1 + s.charAt(i);
            }
        }

        for(int i=0; i<t.length(); i++){
            if(t.charAt(i) == '#'){
                if(final2.length() > 0){
                final2 = final2.substring(0, final2.length() -1);
                }
            }else {
                final2 = final2 + t.charAt(i);
            }
        }

        if(final1.equals(final2)){
            return true;
        }
        return false;
    }
}