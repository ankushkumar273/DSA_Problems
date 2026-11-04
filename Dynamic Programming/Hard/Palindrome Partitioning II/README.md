# Palindrome Partitioning II

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Hard |
| **Language** | java |
| **Solved On** | November 4, 2026 |
| **Tags** | String, Dynamic Programming |
| **Link** | [View Problem](https://leetcode.com/problems/palindrome-partitioning-ii/) |
| **Runtime** | 2834 ms |
| **Memory** | 46.1 MB |

## Problem Description

<p>Given a string <code>s</code>, partition <code>s</code> such that every <span data-keyword="substring-nonempty" class=" cursor-pointer relative text-dark-blue-s text-sm"><button type="button" aria-haspopup="dialog" aria-expanded="false" aria-controls="radix-_r_u_" data-state="closed" class="" fdprocessedid="j9ykid">substring</button></span> of the partition is a <span data-keyword="palindrome-string" class=" cursor-pointer relative text-dark-blue-s text-sm"><button type="button" aria-haspopup="dialog" aria-expanded="false" aria-controls="radix-_r_v_" data-state="closed" class="" fdprocessedid="633nr">palindrome</button></span>.</p>

<p>Return <em>the <strong>minimum</strong> cuts needed for a palindrome partitioning of</em> <code>s</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> s = "aab"
<strong>Output:</strong> 1
<strong>Explanation:</strong> The palindrome partitioning ["aa","b"] could be produced using 1 cut.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> s = "a"
<strong>Output:</strong> 0
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> s = "ab"
<strong>Output:</strong> 1
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 2000</code></li>
	<li><code>s</code> consists of lowercase English letters only.</li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: Easiest Java DP Solution (97.36%)
**Author**: [@yavinci](https://leetcode.com/yavinci/)
**Upvotes**: 441 👍
**Link**: [View Original Post](https://leetcode.com/problems/palindrome-partitioning-ii/solutions/42213/)

---

This can be solved by two points:

 1. `cut[i]` is the minimum of `cut[j - 1] + 1 (j <= i)`, if `[j, i]` is palindrome.
 2. If  `[j, i]` is palindrome, `[j + 1, i - 1]` is palindrome, and `c[j]  == c[i]`.

The 2nd point reminds us of using dp (caching).

    a   b   a   |   c  c
                    j  i
           j-1  |  [j, i] is palindrome
       cut(j-1) +  1


Hope it helps!

    public int minCut(String s) {
        char[] c = s.toCharArray();
        int n = c.length;
        int[] cut = new int[n];
        boolean[][] pal = new boolean[n][n];
        
        for(int i = 0; i < n; i++) {
            int min = i;
            for(int j = 0; j <= i; j++) {
                if(c[j] == c[i] && (j + 1 > i - 1 || pal[j + 1][i - 1])) {
                    pal[j][i] = true;  
                    min = j == 0 ? 0 : Math.min(min, cut[j - 1] + 1);
                }
            }
            cut[i] = min;
        }
        return cut[n - 1];
    }

</details>
