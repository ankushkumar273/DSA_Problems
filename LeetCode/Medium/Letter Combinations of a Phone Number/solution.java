class Solution {
    public void combination(String digits, int index, StringBuilder str, List<String> result, String [] phone){
    //Base case
    if(index == digits.length()){
        result.add(str.toString());
        return;
    }
    //current digit
    String letters = phone[digits.charAt(index) - '0'];
    for(int i=0; i<letters.length(); i++){
        char ch = letters.charAt(i);
        str.append(ch);
        combination(digits, index+1, str, result, phone);
        //Backtrack
        str.deleteCharAt(str.length()-1);
    }
    }
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length() == 0){
            return result;
        }
            String phone[] = { "", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"};

            combination(digits, 0, new StringBuilder(), result, phone);
            return result;
    }
}