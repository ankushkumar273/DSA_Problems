class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int count []= new int[128];
        int left = 0;
        for(int i=0; i<s1.length(); i++){
            count[s1.charAt(i)]++;
        }
            int required = s1.length();
            for(int right=0; right<s2.length(); right++){
                char ch = s2.charAt(right);
                if(count[ch] > 0){
                    required--;
                }
                count[ch]--;

                //windo s1 se bari ho gayi
                if(right-left+1 >s1.length()){
                    char remove = s2.charAt(left);
                    if(count[remove] >= 0){
                    required++;
                }
                count[remove]++;
                left++;
                }
                   
            if(required == 0){
                return true;
            }
        }
        return false;
    }
}