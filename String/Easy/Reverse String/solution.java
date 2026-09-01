class Solution {
    public void reverseString(char[] s) {
        int l = s.length;
        int left = 0;
        int right = l-1;
        while(left < right){
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                left++;
                right--;
        }
    }
}