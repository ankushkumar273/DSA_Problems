class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // code here
        
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        
        for(int num:arr){
            map.put(num, map.getOrDefault(num,0)+1);
                }
            for(int num:map.keySet()){
            if(map.get(num) > n/3){
                 ans.add(num);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
