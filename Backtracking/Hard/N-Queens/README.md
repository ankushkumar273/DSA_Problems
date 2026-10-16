# N-Queens

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Hard |
| **Language** | java |
| **Solved On** | October 16, 2026 |
| **Tags** | Array, Backtracking, Algorithm X |
| **Link** | [View Problem](https://leetcode.com/problems/n-queens/) |
| **Runtime** | 2 ms |
| **Memory** | 46 MB |

## Problem Description

<p>The <strong>n-queens</strong> puzzle is the problem of placing <code>n</code> queens on an <code>n x n</code> chessboard such that no two queens attack each other.</p>

<p>Given an integer <code>n</code>, return <em>all distinct solutions to the <strong>n-queens puzzle</strong></em>. You may return the answer in <strong>any order</strong>.</p>

<p>Each solution contains a distinct board configuration of the n-queens' placement, where <code>'Q'</code> and <code>'.'</code> both indicate a queen and an empty space, respectively.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/13/queens.jpg" style="width: 600px; height: 268px;">
<pre><strong>Input:</strong> n = 4
<strong>Output:</strong> [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
<strong>Explanation:</strong> There exist two distinct solutions to the 4-queens puzzle as shown above
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> n = 1
<strong>Output:</strong> [["Q"]]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 9</code></li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: Share my JAVA DFS solution very easy to understand
**Author**: [@legendaryengineer](https://leetcode.com/legendaryengineer/)
**Upvotes**: 112 👍
**Link**: [View Original Post](https://leetcode.com/problems/n-queens/solutions/19804/)

---

    public class Solution {
        private Set<Integer> col = new HashSet<Integer>();
        private Set<Integer> diag1 = new HashSet<Integer>();
        private Set<Integer> diag2 = new HashSet<Integer>();
        
        public List<List<String>> solveNQueens(int n) {
            List<List<String>> res = new ArrayList<List<String>>();
            dfs(res,new ArrayList<String>(), 0, n);
            return res;
        }
        private void dfs(List<List<String>> res, List<String> list, int row, int n){
            if (row == n){
                res.add(new ArrayList<String>(list));
                return;
            }
            for (int i = 0; i < n; i++){
                if (col.contains(i) || diag1.contains(row + i) || diag2.contains(row - i)) continue;
                
                char[] charArray = new char[n];
                Arrays.fill(charArray, '.');
                charArray[i] = 'Q';
                String rowString = new String(charArray);
                
                list.add(rowString);
                col.add(i);
                diag1.add(row + i);
                diag2.add(row - i);
                
                dfs(res, list, row + 1, n);
                
                list.remove(list.size() - 1);
                col.remove(i);
                diag1.remove(row + i);
                diag2.remove(row - i);
            }
        }
    }

</details>
