# Largest Odd Number in String

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **Language** | java |
| **Solved On** | September 6, 2026 |
| **Tags** | Math, String, Greedy |
| **Link** | [View Problem](https://leetcode.com/problems/largest-odd-number-in-string/) |
| **Runtime** | 1 ms |
| **Memory** | 47.1 MB |

## Problem Description

<p>You are given a string <code>num</code>, representing a large integer. Return <em>the <strong>largest-valued odd</strong> integer (as a string) that is a <strong>non-empty substring</strong> of </em><code>num</code><em>, or an empty string </em><code>""</code><em> if no odd integer exists</em>.</p>

<p>A <strong>substring</strong> is a contiguous sequence of characters within a string.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> num = "52"
<strong>Output:</strong> "5"
<strong>Explanation:</strong> The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> num = "4206"
<strong>Output:</strong> ""
<strong>Explanation:</strong> There are no odd numbers in "4206".
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> num = "35427"
<strong>Output:</strong> "35427"
<strong>Explanation:</strong> "35427" is already an odd number.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= num.length &lt;= 10<sup>5</sup></code></li>
	<li><code>num</code> only consists of digits and does not contain any leading zeros.</li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: ✅ Beats 100% - C++/Java/Python/JS - Odd Number Substring - Visualized
**Author**: [@lancertech6](https://leetcode.com/lancertech6/)
**Upvotes**: 136 👍
**Link**: [View Original Post](https://leetcode.com/problems/largest-odd-number-in-string/solutions/4372468/)

---

![Screenshot 2023-12-07 065808.png](https://assets.leetcode.com/users/images/c365b82c-61f2-4dcd-afd5-c4822d9bed28_1701912690.911027.png)

# YouTube Video Explanation:

[https://youtu.be/_own7BywSmk](https://youtu.be/_own7BywSmk)
<!-- **If you want a video for this question please write in the comments** -->

**\uD83D\uDD25 Please like, share, and subscribe to support our channel\'s mission of making complex concepts easy to understand.**

Subscribe Link: https://www.youtube.com/@leetlogics/?sub_confirmation=1

*Subscribe Goal: 700 Subscribers*
*Current Subscribers: 630*

---

# Example Explanation
Let\'s create a step-by-step explanation using a table:

| Iteration | Current Substring | Last Digit | Odd? | Action                             |
|-----------|---------------------|-------------|------|------------------------------------|
| 1         | "52"                | 2           | No   | Move left (decrement index)       |
| 2         | "5"                 | 5           | Yes  | Return the substring "5"          |

Explanation:
1. Start with the given string "52".
2. The last digit is 2, which is not odd, so move left.
3. Move left to "5", which is an odd digit. Return the substring "5".

This way, we find the largest odd number ("5") within the given string "52".

---
# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The goal is to find the largest odd number within a given integer represented as a string. We need to identify the largest odd substring or return an empty string if no odd number exists.

# Approach
<!-- Describe your approach to solving the problem. -->
1. Iterate through the string from right to left.
2. If the last digit is odd, return the entire string as it is already the largest odd number.
3. If the last digit is even, keep moving left until an odd digit is found.
4. Return the substring from the beginning of the string to the index where the first odd digit is encountered.

# Complexity
- The time complexity is O(n), where n is the length of the input string num.
- The space complexity is O(1) since we are not using any extra space that scales with the input size.

# Code
```java []
class Solution {
    public String largestOddNumber(String num) {
        if((int)num.charAt(num.length()-1)%2==1) return num;
        int i=num.length()-1;
        while(i>=0){
            int n=num.charAt(i);
            if(n%2==1) return num.substring(0,i+1);
            i--;
        }
        return "";
    }
}
```
```C++ []
class Solution {
public:
    string largestOddNumber(string num) {
        if (num.back() % 2 == 1) return num;
        int i = num.length() - 1;
        while (i >= 0) {
            int n = num[i];
            if (n % 2 == 1) return num.substr(0, i + 1);
            i--;
        }
        return "";
    }
};
```
```Python []
class Solution(object):
    def largestOddNumber(self, num):
        for i in range(len(num) - 1, -1, -1):
            if num[i] in {\'1\', \'3\', \'5\', \'7\', \'9\'}:
                return num[:i + 1]
        return \'\'
        
```
```Javascript []
/**
 * @param {string} num
 * @return {string}
 */
var largestOddNumber = function(num) {
    if (parseInt(num.slice(-1)) % 2 === 1) return num;
    let i = num.length - 1;
    while (i >= 0) {
        const n = parseInt(num[i]);
        if (n % 2 === 1) return num.slice(0, i + 1);
        i--;
    }
    return "";
};
```
![upvote.png](https://assets.leetcode.com/users/images/c7595597-30ff-4a18-9fc3-510fe025e6af_1701912704.890089.png)


</details>
