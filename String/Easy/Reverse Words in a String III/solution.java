class Solution {
    public String reverseWords(String s) {
      char arr[] =  s.toCharArray();
      
      int start = 0;
      for(int i=0; i<=arr.length; i++){
        if(i == arr.length || arr[i] == ' '){
            int left = start;
            int right = i-1;
            while(left < right){
                char t = arr[left];
                arr[left] = arr[right];
                arr[right] = t;
                left++;
                right--;
            }
            start = i+1;
        }
      }
      String s1 = new String(arr);
      return s1;
    }
}