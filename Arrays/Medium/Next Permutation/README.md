# Next Permutation

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **Language** | java |
| **Solved On** | September 11, 2026 |
| **Tags** | Array, Two Pointers |
| **Link** | [View Problem](https://leetcode.com/problems/next-permutation/) |
| **Runtime** | 1 ms |
| **Memory** | 45 MB |

## Approach

Next Permutation — Steps

Step 1: Find the Pivot

Set pivot = -1.
Start from i = n - 2 and move backwards.
Check:
A[i] < A[i + 1]
If true:
Set pivot = i
Stop the loop (break).

Step 2: If no Pivot is Found

If pivot == -1, it means the array is in descending order.
Reverse the entire array.
Return.

Step 3: Find the Next Greater Element

Start from the last index: i = n - 1.
Move backwards until i > pivot.
Find the first element such that:
A[i] > A[pivot]
Swap:
A[i] and A[pivot].

Step 4: Reverse the Right Part

Set:
i = pivot + 1
j = n - 1
While i <= j:
Swap A[i] and A[j]
i++
j--

## Problem Description

<p>A <strong>permutation</strong> of an array of integers is an arrangement of its members into a sequence or linear order.</p>

<ul>
	<li>For example, for <code>arr = [1,2,3]</code>, the following are all the permutations of <code>arr</code>: <code>[1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1]</code>.</li>
</ul>

<p>The <strong>next permutation</strong> of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the <strong>next permutation</strong> of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).</p>

<ul>
	<li>For example, the next permutation of <code>arr = [1,2,3]</code> is <code>[1,3,2]</code>.</li>
	<li>Similarly, the next permutation of <code>arr = [2,3,1]</code> is <code>[3,1,2]</code>.</li>
	<li>While the next permutation of <code>arr = [3,2,1]</code> is <code>[1,2,3]</code> because <code>[3,2,1]</code> does not have a lexicographical larger rearrangement.</li>
</ul>

<p>Given an array of integers <code>nums</code>, <em>find the next permutation of</em> <code>nums</code>.</p>

<p>The replacement must be <strong><a href="http://en.wikipedia.org/wiki/In-place_algorithm" target="_blank">in place</a></strong> and use only constant extra memory.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [1,2,3]
<strong>Output:</strong> [1,3,2]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [3,2,1]
<strong>Output:</strong> [1,2,3]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> nums = [1,1,5]
<strong>Output:</strong> [1,5,1]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 100</code></li>
	<li><code>0 &lt;= nums[i] &lt;= 100</code></li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: Readable code without confusing i/j, and with explanation
**Author**: [@TWiStErRob](https://leetcode.com/TWiStErRob/)
**Upvotes**: 937 👍
**Link**: [View Original Post](https://leetcode.com/problems/next-permutation/solutions/13994/)

---

Implementation based on description from [Project Nayuki](http://www.nayuki.io/page/next-lexicographical-permutation-algorithm). I cannot describe it better than them:

![next permutation steps][1]

	public class Solution {
	/*0*/ public void nextPermutation(int[] nums) {
	        // pivot is the element just before the non-increasing (weakly decreasing) suffix
	/*2*/   int pivot = indexOfLastPeak(nums) - 1;
	        // paritions nums into [prefix pivot suffix]
	        if (pivot != -1) {
	            int nextPrefix = lastIndexOfGreater(nums, nums[pivot]); // in the worst case it\'s suffix[0]
	            // next prefix must exist because pivot < suffix[0], otherwise pivot would be part of suffix
	/*4*/       swap(nums, pivot, nextPrefix); // this minimizes the change in prefix
	        }
	/*5*/   reverseSuffix(nums, pivot + 1); // reverses the whole list if there was no pivot
	/*6*/ }
	    
	    /**
	     * Find the last element which is a peak.
	     * In case there are multiple equal peaks, return the first of those.
	     * @return first index of last peak
	     */
	/*1*/ int indexOfLastPeak(int[] nums) {
	        for (int i = nums.length - 1; 0 < i; --i) {
	            if (nums[i - 1] < nums[i]) return i;
	        }
	        return 0;
	    }

	    /** @return last index where the {@code num > threshold} or -1 if not found */
	/*3*/ int lastIndexOfGreater(int[] nums, int threshold) {
	        for (int i = nums.length - 1; 0 <= i; --i) {
	            if (threshold < nums[i]) return i;
	        }
	        return -1;
	    }

	    /** Reverse numbers starting from an index till the end. */
	    void reverseSuffix(int[] nums, int start) {
	        int end = nums.length - 1;
	        while (start < end) {
	            swap(nums, start++, end--);
	        }
	    }
	    
	    void swap(int[] nums, int i, int j) {
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }
	}


  [1]: https://www.nayuki.io/res/next-lexicographical-permutation-algorithm/next-permutation-algorithm.svg

</details>
