class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);
        solve(0,nums, ans , list);
        return ans;
    }

    public void solve(int index, int [] nums, List<List<Integer>> ans, List<Integer> list){
       
        ans.add(new ArrayList<>(list));

         for(int i=index; i<nums.length; i++){
            if(i>index && nums[i] == nums[i-1]){
                continue;
            }
            list.add(nums[i]);

        solve(i+1, nums, ans, list);
        //Backtrack
        list.remove(list.size()-1);
        }  
    }
}