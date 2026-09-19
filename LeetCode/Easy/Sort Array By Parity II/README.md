# Sort Array By Parity II

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **Language** | java |
| **Solved On** | September 19, 2026 |
| **Tags** | Array, Two Pointers, Sorting |
| **Link** | [View Problem](https://leetcode.com/problems/sort-array-by-parity-ii/) |
| **Runtime** | 2 ms |
| **Memory** | 48.6 MB |

## Problem Description

<p>Given an array of integers <code>nums</code>, half of the integers in <code>nums</code> are <strong>odd</strong>, and the other half are <strong>even</strong>.</p>

<p>Sort the array so that whenever <code>nums[i]</code> is odd, <code>i</code> is <strong>odd</strong>, and whenever <code>nums[i]</code> is even, <code>i</code> is <strong>even</strong>.</p>

<p>Return <em>any answer array that satisfies this condition</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [4,2,5,7]
<strong>Output:</strong> [4,5,2,7]
<strong>Explanation:</strong> [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [2,3]
<strong>Output:</strong> [2,3]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= nums.length &lt;= 2 * 10<sup>4</sup></code></li>
	<li><code>nums.length</code> is even.</li>
	<li>Half of the integers in <code>nums</code> are even.</li>
	<li><code>0 &lt;= nums[i] &lt;= 1000</code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow Up:</strong> Could you solve it in-place?</p>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: Java 2ms (99.76% faster)
**Author**: [@kbenriquez](https://leetcode.com/kbenriquez/)
**Upvotes**: 16 👍
**Link**: [View Original Post](https://leetcode.com/problems/sort-array-by-parity-ii/solutions/283369/)

---

1. Get first even entry at the wrong index
2. Get first odd entry at the wrong index
3. swap
4. repeat
```
public int[] sortArrayByParityII(int[] A) {
        int even = 0, odd = 1;
        while(true){
            while(even < A.length && A[even] % 2 == 0) /*(1)*/
                even += 2;
            while(odd < A.length && A[odd] % 2 != 0) /*(2)*/
                odd += 2;
            if(odd >= A.length || even >= A.length) return A;
			
			/*(3)*/
            int temp = A[even];
            A[even] = A[odd];
            A[odd] = temp;
        }
    }
```

</details>
