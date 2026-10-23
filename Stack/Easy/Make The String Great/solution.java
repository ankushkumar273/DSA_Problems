class Solution {
    public String makeGood(String s) {
        Stack<Character> str = new Stack<>();
        for(char ch:s.toCharArray()){
            if(!str.isEmpty() && Math.abs(ch-str.peek())==32){
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