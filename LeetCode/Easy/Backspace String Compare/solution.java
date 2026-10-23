class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> str1 = new Stack<>();
        Stack<Character> str2 = new Stack<>();

        for(char ch:s.toCharArray()){
            if(ch == '#'){
                if(!str1.isEmpty()){
                str1.pop();
                }
            }else{
                str1.push(ch);
            }
        }

        for(char ch:t.toCharArray()){
            if(ch == '#'){
                if(!str2.isEmpty()){
                str2.pop();
                }
            
            }else{
                str2.push(ch);
            }
        }

        if(str1.size() != str2.size()){
            return false;
        }
        while(!str1.isEmpty()){
            if(str1.pop() != str2.pop()){
                return false;
            }
        }
        return true;
    }
}