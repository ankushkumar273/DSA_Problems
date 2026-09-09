class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
            }
            String prifix = strs[0];
            for(int i=1; i<strs.length; i++){
                while(!strs[i].startsWith(prifix)){
                    prifix = prifix.substring(0, prifix.length()-1);
                    if(prifix.isEmpty()){
                        return "";
                    }
                }
            }
            return prifix;
        }
}