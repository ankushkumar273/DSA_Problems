class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        if(arr == null || arr.length == 0){
            return "";
        }
        
        String prifix = arr[0];
        for(int i=1; i<arr.length; i++){
            while(!arr[i].startsWith(prifix)){
                prifix = prifix.substring(0, prifix.length()-1);
                if(prifix.isEmpty()){
                    return "";
                }
            }
        }
        return prifix;
    }
}