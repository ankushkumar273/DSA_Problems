# String Compression

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **Language** | java |
| **Solved On** | October 1, 2026 |
| **Tags** | Two Pointers, String |
| **Link** | [View Problem](https://leetcode.com/problems/string-compression/) |
| **Runtime** | 1 ms |
| **Memory** | 45.5 MB |

## Problem Description

<p>Given an array of characters <code>chars</code>, compress it using the following algorithm:</p>

<p>Begin with an empty string <code>s</code>. For each group of <strong>consecutive repeating characters</strong> in <code>chars</code>:</p>

<ul>
	<li>If the group's length is <code>1</code>, append the character to <code>s</code>.</li>
	<li>Otherwise, append the character followed by the group's length.</li>
</ul>

<p>The compressed string <code>s</code> <strong>should not be returned separately</strong>, but instead, be stored <strong>in the input character array <code>chars</code></strong>. Note that group lengths that are <code>10</code> or longer will be split into multiple characters in <code>chars</code>.</p>

<p>After you are done <strong>modifying the input array,</strong> return <em>the new length of the array</em>.</p>

<p>You must write an algorithm that uses only constant extra space.</p>

<p><strong>Note: </strong>The characters in the array beyond the returned length do not matter and should be ignored.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> chars = ["a","a","b","b","c","c","c"]
<strong>Output:</strong> 6
<strong>Explanation:</strong> The groups are <code>"aa"</code>, <code>"bb"</code>, and <code>"ccc"</code>. This compresses to <code>"a2b2c3"</code>.
After modifying the input array in-place, the first 6 characters of <code>chars</code> should be <code>["a","2","b","2","c","3"]</code>.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> chars = ["a"]
<strong>Output:</strong> 1
<strong>Explanation:</strong> The only group is <code>"a"</code>, which remains uncompressed since it is a single character.
After modifying the input array in-place, the first character of <code>chars</code> should be <code>["a"]</code>.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
<strong>Output:</strong> 4
<strong>Explanation:</strong> The groups are <code>"a"</code> and <code>"bbbbbbbbbbbb"</code>. This compresses to <code>"ab12"</code>.
After modifying the input array in-place, the first 4 characters of <code>chars</code> should be <code>["a","b","1","2"]</code>.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= chars.length &lt;= 2000</code></li>
	<li><code>chars[i]</code> is a lowercase English letter, uppercase English letter, digit, or symbol.</li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: Clean Codes🔥🔥|| Full Explanation✅|| Two Pointers✅|| C++|| Java|| Python3
**Author**: [@N7_BLACKHAT](https://leetcode.com/N7_BLACKHAT/)
**Upvotes**: 343 👍
**Link**: [View Original Post](https://leetcode.com/problems/string-compression/solutions/3245804/)

---

# Intuition :
- Given an array of characters, compress it in-place. The length after compression must always be smaller than or equal to the original array. Every element of the array should be a character (not int) of length 1.
- Example:
```
Input:
["a","a","b","b","c","c","c"]
Output:
Return 6, and the first 6 characters of the input array should be: 
["a","2","b","2","c","3"]
Explanation:
"aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is 
replaced by "c3".
```
<!-- Describe your first thoughts on how to solve this problem. -->

# Detail Explanation to Approach :
- Here we are using two pointers, one for iterating through the original character array and one for keeping track of the current position in the compressed array. The two pointer variables used are `i` and `ans`.
- Now also use a variable to keep track of the count of consecutive characters.
- First set the current letter to the first character in the array and initializes the count to 0. 
- Then iterate through the array until you find a different character or reach the end of the array. 
- For each iteration, increment the count and the index i.
```
// iterate through input array using i pointer
    for (int i = 0; i < chars.length;) {
      final char letter = chars[i]; // current character being compressed
      int count = 0; // count of consecutive occurrences of letter

      // count consecutive occurrences of letter in input array
      while (i < chars.length && chars[i] == letter) {
        ++count;
        ++i;
      }


``` 
- When you find a different character or reach the end of the array, write the current letter to the compressed array and, if the count is greater than 1, write the count as a string to the compressed array. 
- Then reset the count to 0 and set the current letter to the new letter.
```
// write letter to compressed array
      chars[ans++] = letter;

      // if count is greater than 1, write count as string to compressed array
      if (count > 1) {
        // convert count to string and iterate over each character in string
        for (final char c : String.valueOf(count).toCharArray()) {
          chars[ans++] = c;
        }
      }
```
- Finally, return the length of the compressed array, which is equal to the position of the last character in the compressed array plus one.
```
return ans;//return length of compressed array

```
<!-- Describe your approach to solving the problem. -->

# Complexity :
- Time complexity : O(n)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity : O(1)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Please Upvote\uD83D\uDC4D\uD83D\uDC4D
```
Thanks for visiting my solution.\uD83D\uDE0A
```
*Let\'s Code it Up .
There may be minor syntax difference in C++ and Python*

# Codes [C++ |Java |Python3] : With Comments
```C++ []
class Solution {
public:
    int compress(vector<char>& chars) {
        int ans = 0;

        // iterate through input vector using i pointer
        for (int i = 0; i < chars.size();) {
            const char letter = chars[i]; // current character being compressed
            int count = 0; // count of consecutive occurrences of letter

            // count consecutive occurrences of letter in input vector
            while (i < chars.size() && chars[i] == letter) {
                ++count;
                ++i;
            }

            // write letter to compressed vector
            chars[ans++] = letter;

            // if count is greater than 1, write count as string to compressed vector
            if (count > 1) {
                // convert count to string and iterate over each character in string
                for (const char c : to_string(count)) {
                    chars[ans++] = c;
                }
            }
        }

        // return length of compressed vector
        return ans;
    }
};

```
```Java []
class Solution {
  public int compress(char[] chars) {
    int ans = 0; // keep track of current position in compressed array

    // iterate through input array using i pointer
    for (int i = 0; i < chars.length;) {
      final char letter = chars[i]; // current character being compressed
      int count = 0; // count of consecutive occurrences of letter

      // count consecutive occurrences of letter in input array
      while (i < chars.length && chars[i] == letter) {
        ++count;
        ++i;
      }

      // write letter to compressed array
      chars[ans++] = letter;

      // if count is greater than 1, write count as string to compressed array
      if (count > 1) {
        // convert count to string and iterate over each character in string
        for (final char c : String.valueOf(count).toCharArray()) {
          chars[ans++] = c;
        }
      }
    }

    // return length of compressed array
    return ans;
  }
}

```
```Python3 []
class Solution:
  def compress(self, chars: List[str]) -> int:
    ans = 0
    i = 0

    while i < len(chars):
      letter = chars[i]
      count = 0
      while i < len(chars) and chars[i] == letter:
        count += 1
        i += 1
      chars[ans] = letter
      ans += 1
      if count > 1:
        for c in str(count):
          chars[ans] = c
          ans += 1

    return ans
```
# Please Upvote\uD83D\uDC4D\uD83D\uDC4D
![ezgif-3-22a360561c.gif](https://assets.leetcode.com/users/images/505e7a3b-d0fd-419c-b925-f3351ffd0c1b_1677725940.6887608.gif)


</details>
