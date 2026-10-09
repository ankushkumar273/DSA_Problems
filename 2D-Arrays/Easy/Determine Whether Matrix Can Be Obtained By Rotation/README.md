# Determine Whether Matrix Can Be Obtained By Rotation

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **Language** | java |
| **Solved On** | October 9, 2026 |
| **Tags** | Array, Matrix |
| **Link** | [View Problem](https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/) |
| **Runtime** | 1 ms |
| **Memory** | 43.7 MB |

## Problem Description

<p>Given two <code>n x n</code> binary matrices <code>mat</code> and <code>target</code>, return <code>true</code><em> if it is possible to make </em><code>mat</code><em> equal to </em><code>target</code><em> by <strong>rotating</strong> </em><code>mat</code><em> in <strong>90-degree increments</strong>, or </em><code>false</code><em> otherwise.</em></p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/05/20/grid3.png" style="width: 301px; height: 121px;">
<pre><strong>Input:</strong> mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
<strong>Output:</strong> true
<strong>Explanation: </strong>We can rotate mat 90 degrees clockwise to make mat equal target.
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/05/20/grid4.png" style="width: 301px; height: 121px;">
<pre><strong>Input:</strong> mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
<strong>Output:</strong> false
<strong>Explanation:</strong> It is impossible to make mat equal to target by rotating mat.
</pre>

<p><strong class="example">Example 3:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/05/26/grid4.png" style="width: 661px; height: 184px;">
<pre><strong>Input:</strong> mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
<strong>Output:</strong> true
<strong>Explanation: </strong>We can rotate mat 90 degrees clockwise two times to make mat equal target.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == mat.length == target.length</code></li>
	<li><code>n == mat[i].length == target[i].length</code></li>
	<li><code>1 &lt;= n &lt;= 10</code></li>
	<li><code>mat[i][j]</code> and <code>target[i][j]</code> are either <code>0</code> or <code>1</code>.</li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: Java 100% fast ✅ | No rotation ✅| only indexing ✅
**Author**: [@ZenkaiX](https://leetcode.com/ZenkaiX/)
**Upvotes**: 69 👍
**Link**: [View Original Post](https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/solutions/3273931/)

---

# Intuition
We only need to match indexes

# Approach
```
               if(b[i][j]==a[n-j-1][i])
                    c90++;
                if(b[i][j]==a[n-i-1][n-j-1])
                    c180++;
                if(b[i][j]==a[j][n-i-1])
                    c270++;
                if(b[i][j]==a[i][j])
                    c0++;
```

# Complexity
- Time complexity:
O(n*n)

- Space complexity:
O(1)

# Code
```
class Solution {
    public boolean findRotation(int[][] a, int[][] b) {
       

         int n=a.length;
      int c90=0,c180=0,c270=0,c0=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(b[i][j]==a[n-j-1][i])
                    c90++;
                if(b[i][j]==a[n-i-1][n-j-1])
                    c180++;
                if(b[i][j]==a[j][n-i-1])
                    c270++;
                if(b[i][j]==a[i][j])
                    c0++;
            }
        }
        
        if(c90==n*n||c270==n*n||c180==n*n||c0==n*n)
        return true;
        else return false;
        
    }
}




```

![55ttuz.jpg](https://assets.leetcode.com/users/images/cd05c1ee-5cf8-47a0-a62a-a84d1a879c5a_1678312397.4097068.jpeg)


</details>
