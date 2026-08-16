class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        //array ke element ko set me dalo
        for(int num:nums){
            set.add(num);
        }

        //ab chekl karna hai ki kon sa element hai aur kon sa nahi
        
        for(int i=1; i<=nums.length; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}