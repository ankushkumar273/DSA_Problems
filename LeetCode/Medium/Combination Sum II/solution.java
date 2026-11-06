class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        Arrays.sort(candidates);
        
        solve(0, candidates, target, ans, list);
        return ans;
    }
    public void solve(int index, int[] candidates, int target, List<List<Integer>> ans, List<Integer> list){
        //base case
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=index; i<candidates.length; i++){
            if(i>index && candidates[i] == candidates[i-1]){
                continue;
            }
            if(candidates[i] > target){
            break;
            }

            list.add(candidates[i]);
            solve(i+1, candidates, target-candidates[i], ans, list);

            list.remove(list.size()-1);
        }
    }
}