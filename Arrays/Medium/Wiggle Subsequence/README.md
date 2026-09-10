# Wiggle Subsequence

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **Language** | java |
| **Solved On** | September 10, 2026 |
| **Tags** | Array, Dynamic Programming, Greedy |
| **Link** | [View Problem](https://leetcode.com/problems/wiggle-subsequence/) |
| **Runtime** | 0 ms |
| **Memory** | 42.8 MB |

## Approach

One-line trick

UP mila → up = down + 1
DOWN mila → down = up + 1

## Problem Description

<p>A <strong>wiggle sequence</strong> is a sequence where the differences between successive numbers strictly alternate between positive and negative. The first difference (if one exists) may be either positive or negative. A sequence with one element and a sequence with two non-equal elements are trivially wiggle sequences.</p>

<ul>
	<li>For example, <code>[1, 7, 4, 9, 2, 5]</code> is a <strong>wiggle sequence</strong> because the differences <code>(6, -3, 5, -7, 3)</code> alternate between positive and negative.</li>
	<li>In contrast, <code>[1, 4, 7, 2, 5]</code> and <code>[1, 7, 4, 5, 5]</code> are not wiggle sequences. The first is not because its first two differences are positive, and the second is not because its last difference is zero.</li>
</ul>

<p>A <strong>subsequence</strong> is obtained by deleting some elements (possibly zero) from the original sequence, leaving the remaining elements in their original order.</p>

<p>Given an integer array <code>nums</code>, return <em>the length of the longest <strong>wiggle subsequence</strong> of </em><code>nums</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [1,7,4,9,2,5]
<strong>Output:</strong> 6
<strong>Explanation:</strong> The entire sequence is a wiggle sequence with differences (6, -3, 5, -7, 3).
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [1,17,5,10,13,15,10,5,16,8]
<strong>Output:</strong> 7
<strong>Explanation:</strong> There are several subsequences that achieve this length.
One is [1, 17, 10, 13, 10, 16, 8] with differences (16, -7, 3, -3, 6, -8).
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> nums = [1,2,3,4,5,6,7,8,9]
<strong>Output:</strong> 2
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 1000</code></li>
	<li><code>0 &lt;= nums[i] &lt;= 1000</code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong> Could you solve this in <code>O(n)</code> time?</p>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: Very Simple Java Solution with detail explanation
**Author**: [@keshavk](https://leetcode.com/keshavk/)
**Upvotes**: 118 👍
**Link**: [View Original Post](https://leetcode.com/problems/wiggle-subsequence/solutions/84849/)

---

In Wiggle Subsequence, think that the solution we need should be in a way that we get alternative higher, lower,higher number.
Eg: 2, 5, 3, 8, 6, 9 
In above example, the sequence of numbers is small,big,small,big,small,big numbers (In shape of hill).

Now for explanation, we take example series:
2,1,4,5,6,3,3,4,8,4

First we check  if the series is starting as (big, small) or (small, big). So as 2,1 is big, small. So we will start the loop as we need small number first that is 1 as 2 is already there.
```
Step 1: First we check our requirement is to get small number. As 1<2 so the series will be
 2,1
```
```
Step 2: Now we need big number that is  greater than 1. As 4>1 so series  will be
2,1,4
```
```
Step 3: Now we need small number. But 5>4 so 4 will be replaced by 5. So the series will become
2,1,5
```
```
Step 4:  We need small number. But 6>5. Series will be
2,1,6
```
```
Step 5: Require small number. 3<6. Series will be
2,1,6,3
```
```
Step 6: Require big number. 3=3. No change in series
2,1,6,3
```
```
Step 7: Require big number. 4>3. Series will become
2,1,6,3,4
```
```
Step 8:  Require small number. 8>4. 8 will  replace 4 and series will become
2,1,6,3,8
```
```
Step 9: Require small number. 4<8. So final series will  be
2,1,6,3,8,4
```
Answer is 6.

In the code, for constant space O(1) we will  modify the same 'num' array to store the (small, big, small) hill shape values. So the code will not only calculate the length of the sequence but if the interviewers asks for the Wiggle series also then we can return the series too. The leetcode Online Judge skipped a test case if the series starts with same set of numbers. Thanks to @ztq63830398, modified the  code to consider that test case also.    

Code:
```
    public class Solution {
	public int wiggleMaxLength(int[] nums) {
		if (nums.length == 0 || nums.length == 1) {
			return nums.length;
		}
		int k = 0;
		while (k < nums.length - 1 && nums[k] == nums[k + 1]) {  //Skips all the same numbers from series beginning eg 5, 5, 5, 1
			k++;
		}
		if (k == nums.length - 1) {
			return 1;
		}
		int result = 2;     // This will track the result of result array
		boolean smallReq = nums[k] < nums[k + 1];       //To check series starting pattern
		for (int i = k + 1; i < nums.length - 1; i++) {
			if (smallReq && nums[i + 1] < nums[i]) {
				nums[result] = nums[i + 1];
				result++;
				smallReq = !smallReq;    //Toggle the requirement from small to big number
			} else {
				if (!smallReq && nums[i + 1] > nums[i]) {
					nums[result] = nums[i + 1];
					result++;
					smallReq = !smallReq;    //Toggle the requirement from big to small number
				}
			}
		}
		return result;
	}
}
```

</details>
