class Solution {
    public int compress(char[] chars) {
        int index = 0;
        for(int i=0; i<chars.length; i++){
            char ch = chars[i];
            int count = 1;
            while(i+1<chars.length && chars[i] == chars[i+1]){
                count++;
                i++;
            }
            chars[index++] = ch;
            if(count > 1){
                String str = String.valueOf(count);
                for(int j=0; j<str.length(); j++){
                    chars[index++] = str.charAt(j);
                }
            }
        }
        return index;
    }
}