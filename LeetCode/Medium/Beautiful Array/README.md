# Beautiful Array

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **Language** | java |
| **Solved On** | October 18, 2026 |
| **Tags** | Array, Math, Divide and Conquer |
| **Link** | [View Problem](https://leetcode.com/problems/beautiful-array/) |
| **Runtime** | 4 ms |
| **Memory** | 43 MB |

## Problem Description

<p>An array <code>nums</code> of length <code>n</code> is <strong>beautiful</strong> if:</p>

<ul>
	<li><code>nums</code> is a permutation of the integers in the range <code>[1, n]</code>.</li>
	<li>For every <code>0 &lt;= i &lt; j &lt; n</code>, there is no index <code>k</code> with <code>i &lt; k &lt; j</code> where <code>2 * nums[k] == nums[i] + nums[j]</code>.</li>
</ul>

<p>Given the integer <code>n</code>, return <em>any <strong>beautiful</strong> array </em><code>nums</code><em> of length </em><code>n</code>. There will be at least one valid answer for the given <code>n</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> n = 4
<strong>Output:</strong> [2,1,4,3]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> n = 5
<strong>Output:</strong> [3,1,2,5,4]
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 1000</code></li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: ✅ Beautiful Array || Easy & Clean || W/ 2 Approach
**Author**: [@Maango16](https://leetcode.com/Maango16/)
**Upvotes**: 17 👍
**Link**: [View Original Post](https://leetcode.com/problems/beautiful-array/solutions/1367779/)

---

# **APPROACH 1:**
* **Iterative/sorting-**
![Meaning Of Using Bits](https://assets.leetcode.com/users/images/8a56cda7-5496-49b8-89be-2eae3e4ad95b_1627456380.537388.png)


```
vector<int> beautifulArray(int n) 
{
	vector<int> ans(n);
	iota(begin(out), end(out), 1);
	sort(begin(out), end(out), [](auto & x, auto & y){ return -(x^y)&x&~y; });
	return ans;  
}
```
**Time Complexity: O(NlogN)
Space Complexity: O(1)**



# **APPROACH 2:**
**ALGORITHM:**
* Create a vector called ans, insert 1 into ans
* While size of ans < N
	* create a vector temp
	* for i in range 0 to size of ans \u2013 1 
		* if ans[i] * 2 \u2013 1 <= N, then insert ans[i] * 2 \u2013 1 into temp array 
	* for i in range 0 to size of ans \u2013 1
		* if ans[i] * 2 <= N, then insert ans[i] * 2 into temp array
	* set ans := temp
* return ans

**SOLUTION:**
`In C++`
```
class Solution {
public:
    vector<int> beautifulArray(int n) {
        vector<int> ans ;
        ans.push_back(1) ;
        while(ans.size() < n)
        {
            vector<int> temp ;
            for(auto i:ans)
            {
                if(i*2 - 1 <= n)
                {
                    temp.push_back(i*2 - 1) ;
                }
            }
            for(auto i:ans)
            {
                if(i*2 <= n)
                {
                    temp.push_back(i*2) ;
                }
            }
            ans = temp ;
        }
        return ans ;
    }
};
```

</details>
