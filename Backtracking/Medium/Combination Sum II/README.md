# Combination Sum II

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **Language** | java |
| **Solved On** | November 6, 2026 |
| **Tags** | Array, Backtracking |
| **Link** | [View Problem](https://leetcode.com/problems/combination-sum-ii/) |
| **Runtime** | 6 ms |
| **Memory** | 45 MB |

## Problem Description

<p>Given a collection of candidate numbers (<code>candidates</code>) and a target number (<code>target</code>), find all unique combinations in <code>candidates</code>&nbsp;where the candidate numbers sum to <code>target</code>.</p>

<p>Each number in <code>candidates</code>&nbsp;may only be used <strong>once</strong> in the combination.</p>

<p><strong>Note:</strong>&nbsp;The solution set must not contain duplicate combinations.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> candidates = [10,1,2,7,6,1,5], target = 8
<strong>Output:</strong> 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> candidates = [2,5,2,1,2], target = 5
<strong>Output:</strong> 
[
[1,2,2],
[5]
]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;=&nbsp;candidates.length &lt;= 100</code></li>
	<li><code>1 &lt;=&nbsp;candidates[i] &lt;= 50</code></li>
	<li><code>1 &lt;= target &lt;= 30</code></li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: Combination Sum I, II and III Java solution (see the similarities yourself)
**Author**: [@issac3](https://leetcode.com/issac3/)
**Upvotes**: 318 👍
**Link**: [View Original Post](https://leetcode.com/problems/combination-sum-ii/solutions/16878/)

---

Combination Sum I

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list, new ArrayList<Integer>(), candidates, target, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] cand, int remain, int start) {
        if (remain < 0) return; /** no solution */
        else if (remain == 0) list.add(new ArrayList<>(tempList));
        else{
            for (int i = start; i < cand.length; i++) { 
                tempList.add(cand[i]);
                backtrack(list, tempList, cand, remain-cand[i], i);
                tempList.remove(tempList.size()-1);
            } 
        }

    }

Combination Sum II

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>> list = new LinkedList<List<Integer>>();
       Arrays.sort(candidates);
       backtrack(list, new ArrayList<Integer>(), candidates, target, 0);
       return list;
    }
    
    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] cand, int remain, int start) {
       
       if(remain < 0) return; /** no solution */
       else if(remain == 0) list.add(new ArrayList<>(tempList));
       else{
          for (int i = start; i < cand.length; i++) {
             if(i > start && cand[i] == cand[i-1]) continue; /** skip duplicates */
             tempList.add(cand[i]);
             backtrack(list, tempList, cand, remain - cand[i], i+1);
             tempList.remove(tempList.size() - 1);
          }
       }
    }

Combination Sum III

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<Integer>(), k, n, 1);
        return list;
    }
    
    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int k, int remain, int start) {
        if(tempList.size() > k) return; /** no solution */
        else if(tempList.size() == k && remain == 0) list.add(new ArrayList<>(tempList));
        else{
            for (int i = start; i <= 9; i++) {
                tempList.add(i);
                backtrack(list, tempList, k, remain-i, i+1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

</details>
