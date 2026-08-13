
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // code here
        HashMap <Integer, Integer> map = new HashMap<>();
        
        // a element ki frequency
        for(int num:a){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        // b element karo
        for(int num:b){
            if(!map.containsKey(num) || map.get(num)==0){
                return false;
            }
            map.put(num,map.get(num)-1);
        }
        return true;
    }
}
