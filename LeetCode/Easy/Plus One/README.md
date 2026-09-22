# Plus One

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **Language** | java |
| **Solved On** | September 22, 2026 |
| **Tags** | Array, Math |
| **Link** | [View Problem](https://leetcode.com/problems/plus-one/) |
| **Runtime** | 0 ms |
| **Memory** | 43.6 MB |

## Problem Description

<p>You are given a <strong>large integer</strong> represented as an integer array <code>digits</code>, where each <code>digits[i]</code> is the <code>i<sup>th</sup></code> digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading <code>0</code>'s.</p>

<p>Increment the large integer by one and return <em>the resulting array of digits</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> digits = [1,2,3]
<strong>Output:</strong> [1,2,4]
<strong>Explanation:</strong> The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> digits = [4,3,2,1]
<strong>Output:</strong> [4,3,2,2]
<strong>Explanation:</strong> The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> digits = [9]
<strong>Output:</strong> [1,0]
<strong>Explanation:</strong> The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= digits.length &lt;= 100</code></li>
	<li><code>0 &lt;= digits[i] &lt;= 9</code></li>
	<li><code>digits</code> does not contain any leading <code>0</code>'s.</li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: ✅ JAVA ✅ Fastest --> 0ms Runtime easy and elegant Solution
**Author**: [@bgautam1254](https://leetcode.com/bgautam1254/)
**Upvotes**: 1772 👍
**Link**: [View Original Post](https://leetcode.com/problems/plus-one/solutions/2706861/)

---

```
for (int i = digits.length - 1; i >= 0; i--) {
	if (digits[i] < 9) {
		digits[i]++;
		return digits;
	}
	digits[i] = 0;
}

digits = new int[digits.length + 1];
digits[0] = 1;
return digits;
```


explanation

```
for (int i = digits.length - 1; i >= 0; i--) {
	if (digits[i] < 9) {
		digits[i]++;
		return digits;
		// starting from extreme right--> if array[i] is less than 9 means can be added with 1
		// i.e. [ 5,8 ]-->[ 5,9 ] or
		//      [ 9,4 ]-->[ 9,5 ] or
		//      [ 6,0 ]-->[ 6,1 ]
		// and will directly return array
	}
	digits[i] = 0;
	// if array[i] is not less than 9, means it have to be 9 only then digit is changed to 0,
	// and we again revolve around loop to check for number if less than 9 or not
	// i.e. [ 5,9 ]-->[ 5,0 ]-loop->[ 6,0 ] or
	//      [ 1,9,9 ]-->[ 1,9,0 ]-loop->[ 1,0,0 ]-loop->[ 2,0,0 ]
	// and will directly return array
}

// if all number inside array are 9
// i.e. [ 9,9,9,9 ] than according to above loop it will become [ 0,0,0,0 ]
// but we have to make it like this [ 9,9,9,9 ]-->[ 1,0,0,0,0 ]


// to make like above we need to make new array of length--> n+1
// by default new array values are set to -->0 only
// thus just changed first value of array to 1 and return the array

digits = new int[digits.length + 1];
digits[0] = 1;
return digits;
```

**TC O(n)
SC O(n)**



**If you have any question, feel free to ask. If you like the solution or the explanation, Please UPVOTE !**

</details>
