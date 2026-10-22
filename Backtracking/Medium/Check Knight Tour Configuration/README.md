# Check Knight Tour Configuration

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **Language** | java |
| **Solved On** | October 22, 2026 |
| **Tags** | Array, Depth-First Search, Breadth-First Search, Matrix, Simulation |
| **Link** | [View Problem](https://leetcode.com/problems/check-knight-tour-configuration/) |
| **Runtime** | 1 ms |
| **Memory** | 46 MB |

## Problem Description

<p>There is a knight on an <code>n x n</code> chessboard. In a valid configuration, the knight starts <strong>at the top-left cell</strong> of the board and visits every cell on the board <strong>exactly once</strong>.</p>

<p>You are given an <code>n x n</code> integer matrix <code>grid</code> consisting of distinct integers from the range <code>[0, n * n - 1]</code> where <code>grid[row][col]</code> indicates that the cell <code>(row, col)</code> is the <code>grid[row][col]<sup>th</sup></code> cell that the knight visited. The moves are <strong>0-indexed</strong>.</p>

<p>Return <code>true</code> <em>if</em> <code>grid</code> <em>represents a valid configuration of the knight's movements or</em> <code>false</code> <em>otherwise</em>.</p>

<p><strong>Note</strong> that a valid knight move consists of moving two squares vertically and one square horizontally, or two squares horizontally and one square vertically. The figure below illustrates all the possible eight moves of a knight from some cell.</p>
<img alt="" src="https://assets.leetcode.com/uploads/2018/10/12/knight.png" style="width: 300px; height: 300px;">
<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2022/12/28/yetgriddrawio-5.png" style="width: 251px; height: 251px;">
<pre><strong>Input:</strong> grid = [[0,11,16,5,20],[17,4,19,10,15],[12,1,8,21,6],[3,18,23,14,9],[24,13,2,7,22]]
<strong>Output:</strong> true
<strong>Explanation:</strong> The above diagram represents the grid. It can be shown that it is a valid configuration.
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2022/12/28/yetgriddrawio-6.png" style="width: 151px; height: 151px;">
<pre><strong>Input:</strong> grid = [[0,3,6],[5,8,1],[2,7,4]]
<strong>Output:</strong> false
<strong>Explanation:</strong> The above diagram represents the grid. The 8<sup>th</sup> move of the knight is not valid considering its position after the 7<sup>th</sup> move.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == grid.length == grid[i].length</code></li>
	<li><code>3 &lt;= n &lt;= 7</code></li>
	<li><code>0 &lt;= grid[row][col] &lt; n * n</code></li>
	<li>All integers in <code>grid</code> are <strong>unique</strong>.</li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: Clean || Short || Recursion || Java
**Author**: [@HimanshuBhoir](https://leetcode.com/HimanshuBhoir/)
**Upvotes**: 24 👍
**Link**: [View Original Post](https://leetcode.com/problems/check-knight-tour-configuration/solutions/3314147/)

---

```java []
class Solution {
    boolean dest = false;
    public boolean checkValidGrid(int[][] grid) {
        check(grid, 0, 0, -1);
        return dest;
    }
    void check(int[][] grid, int i, int j, int prev){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid.length || grid[i][j] != prev+1)   return;
        if(grid[i][j] == grid.length*grid.length-1) dest = true;
        check(grid,i+2,j+1,grid[i][j]);
        check(grid,i+2,j-1,grid[i][j]);
        check(grid,i+1,j+2,grid[i][j]);
        check(grid,i+1,j-2,grid[i][j]);
        check(grid,i-2,j+1,grid[i][j]);
        check(grid,i-2,j-1,grid[i][j]);
        check(grid,i-1,j+2,grid[i][j]);
        check(grid,i-1,j-2,grid[i][j]);
    }
}
```

</details>
