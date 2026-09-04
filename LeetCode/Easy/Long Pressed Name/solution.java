class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;
        char arr1[] = name.toCharArray();
        char arr2[] = typed.toCharArray();
        while (j < typed.length()){
            if(i < name.length() && arr1[i] == arr2[j]){
                i++;
                j++;
            }else if(j > 0 && arr2[j-1] == arr2[j]){
                j++;
            }
            else {
                return false;
            }
        }
        
        return i == name.length();
    }
}