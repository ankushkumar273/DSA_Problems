# Most Frequent Number Following Key In an Array

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **Language** | java |
| **Solved On** | October 18, 2026 |
| **Tags** | Array, Hash Table, Counting |
| **Link** | [View Problem](https://leetcode.com/problems/most-frequent-number-following-key-in-an-array/) |
| **Runtime** | 3 ms |
| **Memory** | 46.1 MB |

## Problem Description

<p>You are given a <strong>0-indexed</strong> integer array <code>nums</code>.<strong> </strong>You are also given an integer <code>key</code>, which is present in <code>nums</code>.</p>

<p>For every unique integer <code>target</code> in <code>nums</code>, <strong>count</strong> the number of times <code>target</code> immediately follows an occurrence of <code>key</code> in <code>nums</code>. In other words, count the number of indices <code>i</code> such that:</p>

<ul>
	<li><code>0 &lt;= i &lt;= nums.length - 2</code>,</li>
	<li><code>nums[i] == key</code> and,</li>
	<li><code>nums[i + 1] == target</code>.</li>
</ul>

<p>Return <em>the </em><code>target</code><em> with the <strong>maximum</strong> count</em>. The test cases will be generated such that the <code>target</code> with maximum count is unique.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [1,100,200,1,100], key = 1
<strong>Output:</strong> 100
<strong>Explanation:</strong> For target = 100, there are 2 occurrences at indices 1 and 4 which follow an occurrence of key.
No other integers follow an occurrence of key, so we return 100.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [2,2,2,2,3], key = 2
<strong>Output:</strong> 2
<strong>Explanation:</strong> For target = 2, there are 3 occurrences at indices 1, 2, and 3 which follow an occurrence of key.
For target = 3, there is only one occurrence at index 4 which follows an occurrence of key.
target = 2 has the maximum number of occurrences following an occurrence of key, so we return 2.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= nums.length &lt;= 1000</code></li>
	<li><code>1 &lt;= nums[i] &lt;= 1000</code></li>
	<li>The test cases will be generated such that the answer is unique.</li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: [Java/Python 3] Simple code.
**Author**: [@rock](https://leetcode.com/rock/)
**Upvotes**: 27 👍
**Link**: [View Original Post](https://leetcode.com/problems/most-frequent-number-following-key-in-an-array/solutions/1822098/)

---

**Java**
```java
    public int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> freq = new HashMap<>();
        int mostFreq = -1;
        for (int i = 0, n = nums.length, max = 0; i + 1 < n; ++i) {
            if (nums[i] == key) {
                int candidate = nums[i + 1];
                freq.put(candidate, 1 + freq.getOrDefault(candidate, 0));
                if (freq.get(candidate) > max) {
                    max = freq.get(candidate);
                    mostFreq = candidate;
                }
            }
        }
        return mostFreq;
    }
```
Or make the above simpler as follows:

```java
    public int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> freq = new HashMap<>();
        int mostFreq = nums[0];
        for (int i = 0, n = nums.length; i + 1 < n; ++i) {
            if (nums[i] == key && 
                        freq.merge(nums[i + 1], 1, Integer::sum) > 
                        freq.get(mostFreq)) {
                mostFreq = nums[i + 1];
            }
        }
        return mostFreq;
    }
```

----

**Python 3**

```python
    def mostFrequent(self, nums: List[int], key: int) -> int:
        c = Counter()
        for i, n in enumerate(nums):
            if n == key and i + 1 < len(nums):
                c[nums[i + 1]] += 1
        return c.most_common(1)[0][0]
```

One liner for fun: - credit to **@stefan4trivia**.

```python
    def mostFrequent(self, nums: List[int], key: int) -> int:
        return statistics.mode(b for a, b in itertools.pairwise(nums) if a == key)
```

</details>
