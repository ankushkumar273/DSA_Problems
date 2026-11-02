# Palindrome Partitioning

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **Language** | java |
| **Solved On** | November 2, 2026 |
| **Tags** | String, Dynamic Programming, Backtracking |
| **Link** | [View Problem](https://leetcode.com/problems/palindrome-partitioning/) |
| **Runtime** | 8 ms |
| **Memory** | 64.8 MB |

## Problem Description

<p>Given a string <code>s</code>, partition <code>s</code> such that every <span data-keyword="substring-nonempty" class=" cursor-pointer relative text-dark-blue-s text-sm"><button type="button" aria-haspopup="dialog" aria-expanded="false" aria-controls="radix-_r_u_" data-state="closed" class="" fdprocessedid="nqgxhe">substring</button></span> of the partition is a <span data-keyword="palindrome-string" class=" cursor-pointer relative text-dark-blue-s text-sm"><button type="button" aria-haspopup="dialog" aria-expanded="false" aria-controls="radix-_r_v_" data-state="closed" class="" fdprocessedid="s5f8y7"><strong>palindrome</strong></button></span>. Return <em>all possible palindrome partitioning of </em><code>s</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> s = "aab"
<strong>Output:</strong> [["a","a","b"],["aa","b"]]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> s = "a"
<strong>Output:</strong> [["a"]]
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 16</code></li>
	<li><code>s</code> contains only lowercase English letters.</li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: Java DP + DFS solution
**Author**: [@yfcheng](https://leetcode.com/yfcheng/)
**Upvotes**: 276 👍
**Link**: [View Original Post](https://leetcode.com/problems/palindrome-partitioning/solutions/41982/)

---

The normal dfs backtracking will need to check each substring for palindrome, but a dp array can be used to record the possible break for palindrome before we start recursion.

Edit:
Sharing my thought process:
first, I ask myself that how to check if a string is palindrome or not, usually a two point solution scanning from front and back.  Here if you want to get all the possible palindrome partition, first a nested for loop to get every possible partitions for a string, then a scanning for all the partitions.  That's a O(n^2) for partition and O(n^2) for the scanning of string, totaling at O(n^4) just for the partition.  However, if we use a 2d array to keep track of any string we have scanned so far, with an addition pair, we can determine whether it's palindrome or not by justing looking at that pair, which is this line `if(s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[j+1][i-1]))`.  This way, the 2d array `dp` contains the possible palindrome partition among all.  

second, based on the prescanned palindrome partitions saved in dp array, a simple backtrack does the job.

    public class Solution {
        public List<List<String>> partition(String s) {
            List<List<String>> res = new ArrayList<>();
            boolean[][] dp = new boolean[s.length()][s.length()];
            for(int i = 0; i < s.length(); i++) {
                for(int j = 0; j <= i; j++) {
                    if(s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[j+1][i-1])) {
                        dp[j][i] = true;
                    }
                }
            }
            helper(res, new ArrayList<>(), dp, s, 0);
            return res;
        }
        
        private void helper(List<List<String>> res, List<String> path, boolean[][] dp, String s, int pos) {
            if(pos == s.length()) {
                res.add(new ArrayList<>(path));
                return;
            }
            
            for(int i = pos; i < s.length(); i++) {
                if(dp[pos][i]) {
                    path.add(s.substring(pos,i+1));
                    helper(res, path, dp, s, i+1);
                    path.remove(path.size()-1);
                }
            }
        }
    }

</details>
