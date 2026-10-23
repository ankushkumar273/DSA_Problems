class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> str = new Stack<>();
        for(char ch:s.toCharArray()){
            if(!str.isEmpty() && ch == str.peek()){
                str.pop();
            }
            else{
                str.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!str.isEmpty()){
            sb.append(str.pop());
        }
        return sb.reverse().toString();
    }
}