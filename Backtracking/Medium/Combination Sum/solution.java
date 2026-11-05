class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        solve(0, candidates, target, ans, list);
        return ans;
    }

    public void solve(int index, int[] candidates, int target, List<List<Integer>> ans, List<Integer> list){
        //base case 
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }

        if(index == candidates.length || target<0){
            return;
        }

        list.add(candidates[index]);

        solve(index, candidates, target-candidates[index], ans, list);

        //backtrack
        list.remove(list.size()-1);

        solve(index+1, candidates, target, ans, list);


    }
}