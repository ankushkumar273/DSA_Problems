# Make The String Great

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **Language** | java |
| **Solved On** | October 23, 2026 |
| **Tags** | String, Stack |
| **Link** | [View Problem](https://leetcode.com/problems/make-the-string-great/) |
| **Runtime** | 3 ms |
| **Memory** | 43.4 MB |

## Problem Description

<p>Given a string <code>s</code> of lower and upper case English letters.</p>

<p>A good string is a string which doesn't have <strong>two adjacent characters</strong> <code>s[i]</code> and <code>s[i + 1]</code> where:</p>

<ul>
	<li><code>0 &lt;= i &lt;= s.length - 2</code></li>
	<li><code>s[i]</code> is a lower-case letter and <code>s[i + 1]</code> is the same letter but in upper-case or <strong>vice-versa</strong>.</li>
</ul>

<p>To make the string good, you can choose <strong>two adjacent</strong> characters that make the string bad and remove them. You can keep doing this until the string becomes good.</p>

<p>Return <em>the string</em> after making it good. The answer is guaranteed to be unique under the given constraints.</p>

<p><strong>Notice</strong> that an empty string is also good.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> s = "leEeetcode"
<strong>Output:</strong> "leetcode"
<strong>Explanation:</strong> In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode".
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> s = "abBAcC"
<strong>Output:</strong> ""
<strong>Explanation:</strong> We have many possible scenarios, and all lead to the same answer. For example:
"abBAcC" --&gt; "aAcC" --&gt; "cC" --&gt; ""
"abBAcC" --&gt; "abBA" --&gt; "aA" --&gt; ""
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> s = "s"
<strong>Output:</strong> "s"
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 100</code></li>
	<li><code>s</code> contains only lower and upper case English letters.</li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: ✅98.44%🔥Easy Soluiton🔥With explanation🔥
**Author**: [@MrAke](https://leetcode.com/MrAke/)
**Upvotes**: 183 👍
**Link**: [View Original Post](https://leetcode.com/problems/make-the-string-great/solutions/4975146/)

---

# Intuition
#### The problem can be approached using a stack data structure. By iterating through the string, we can check adjacent characters. If they form a `"bad pair"` according to the given conditions, we remove them from consideration. We repeat this process until no more bad pairs are found.

---
# Approach
#### 1. Initialize an empty stack.
#### 2. Iterate through each character in the input string.
#### 3. For each character, check if it forms a bad pair with the top character of the stack. If it does, pop the character from the stack.
#### 4. If the character doesn\'t form a bad pair, push it onto the stack.
#### 5. Finally, join the characters left in the stack to form the resultant string.
---

# Complexity
- ## Time complexity:
#### We iterate through each character of the input string once, resulting in a time complexity of $$O(n)$$, where n is the length of the string.

- ## Space complexity:
#### We utilize a stack to store characters. In the worst-case scenario, we might end up storing all characters in the stack. Therefore, the space complexity is $$O(n)$$, where n is the length of the string.
---
# Code

```python []
class Solution:
    def makeGood(self, s: str) -> str:
        stack = []  
        for char in s:
            if stack and abs(ord(char) - ord(stack[-1])) == 32:
                stack.pop()
            else:
                stack.append(char)

        return \'\'.join(stack)
```
```C++ []
class Solution {
public:
    std::string makeGood(std::string s) {
        std::stack<char> stack;
        
        for (char c : s) {
            if (!stack.empty() && std::abs(c - stack.top()) == 32) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        
        std::string result;
        while (!stack.empty()) {
            result = stack.top() + result;
            stack.pop();
        }
        
        return result;
    }
};
```
```java []
class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && Math.abs(c - stack.peek()) == 32) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        
        return result.toString();
    }
}
```
```javascript []
var makeGood = function(s) {
    const stack = [];
    
    for (const char of s) {
        if (stack.length > 0 && Math.abs(char.charCodeAt() - stack[stack.length - 1].charCodeAt()) === 32) {
            stack.pop();
        } else {
            stack.push(char);
        }
    }
    
    return stack.join(\'\');
};

```
```C# []
public class Solution {
    public string MakeGood(string s) {
        Stack<char> stack = new Stack<char>();
        
        foreach (char c in s) {
            if (stack.Count > 0 && Math.Abs(c - stack.Peek()) == 32) {
                stack.Pop();
            } else {
                stack.Push(c);
            }
        }
        
        char[] resultChars = stack.ToArray();
        Array.Reverse(resultChars);
        
        return new string(resultChars);
    }
}
```
----

![Screenshot 2023-08-20 065922.png](https://assets.leetcode.com/users/images/9e3a59a1-4251-4e7d-9dd1-ab8c8904e0d5_1712276233.1846683.png)








</details>
