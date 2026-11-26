class Solution {
    public String removeKdigits(String num, int k) {
       Stack<Character> s = new Stack<>();

       for(int i=0; i<num.length(); i++){
        char curr = num.charAt(i);

        while(!s.isEmpty() && k>0 && curr<s.peek()){
            s.pop();
            k--;
        }
        s.push(curr);
       }

       //abhi k>0 hai to
       while(k>0 && !s.isEmpty()){
        s.pop();
        k--;
       }

       //stack to string
       StringBuilder ans = new StringBuilder();
       while(!s.isEmpty()){
        ans.append(s.pop());
       }
       ans.reverse();
       //leading is zero
        while(ans.length() >0 && ans.charAt(0) == '0'){
        ans.deleteCharAt(0);
    }
     return ans.length() == 0 ? "0" : ans.toString();
    }
}