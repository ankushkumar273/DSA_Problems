# Permutation in String

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **Language** | java |
| **Solved On** | September 25, 2026 |
| **Tags** | Hash Table, Two Pointers, String, Sliding Window |
| **Link** | [View Problem](https://leetcode.com/problems/permutation-in-string/) |
| **Runtime** | 7 ms |
| **Memory** | 44 MB |

## Approach

Code mein liye gaye steps:
count[128] array banaya → characters ka count store karne ke liye.
s1 ke har character ka count count array mein store kiya.
left = 0 rakha → window ka starting point.
required = s1.length() rakha → kitne characters abhi required hain.
right pointer se s2 ko left se right move kiya.
Current character ch ko check kiya:
Agar ch required hai → required--
Us character ka count count[ch]--
Check kiya ki current window ki length s1.length() se badi toh nahi.
Agar window badi hai:
left wale character ko window se remove kiya.
Uska count wapas count mein ++ kiya.
Zarurat ho toh required++ kiya.
left++ kiya.

Har step par check kiya:

if(required == 0)

Agar 0 hai → permutation mil gayi → true.

Agar poora s2 check karne ke baad required == 0 nahi hua → false.

Main concept: right character add karta hai, left character remove karta hai, aur dono milkar fixed-size sliding window maintain karte hain.

## Problem Description

<p>Given two strings <code>s1</code> and <code>s2</code>, return <code>true</code> if <code>s2</code> contains a <span data-keyword="permutation-string" class=" cursor-pointer relative text-dark-blue-s text-sm"><button type="button" aria-haspopup="dialog" aria-expanded="false" aria-controls="radix-_r_t_" data-state="closed" class="" fdprocessedid="mna0wm">permutation</button></span> of <code>s1</code>, or <code>false</code> otherwise.</p>

<p>In other words, return <code>true</code> if one of <code>s1</code>'s permutations is the substring of <code>s2</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> s1 = "ab", s2 = "eidbaooo"
<strong>Output:</strong> true
<strong>Explanation:</strong> s2 contains one permutation of s1 ("ba").
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> s1 = "ab", s2 = "eidboaoo"
<strong>Output:</strong> false
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s1.length, s2.length &lt;= 10<sup>4</sup></code></li>
	<li><code>s1</code> and <code>s2</code> consist of lowercase English letters.</li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: 🌟 Quick Way to Detect String Permutations 💯🔥
**Author**: [@withaarzoo](https://leetcode.com/withaarzoo/)
**Upvotes**: 69 👍
**Link**: [View Original Post](https://leetcode.com/problems/permutation-in-string/solutions/5871072/)

---

![Screenshot 2024-07-02 113653.png](https://assets.leetcode.com/users/images/79cc698b-da1f-4780-aa7c-d9a8ef845a4a_1728086718.1797266.png)

Explore a collection of solutions to LeetCode problems in multiple programming languages. Each solution includes a detailed explanation and step-by-step approach to solving the problem efficiently. Whether you\'re a beginner looking to learn or an experienced coder seeking optimized solutions, this repository aims to provide clear and insightful approaches to tackling challenging LeetCode problems.

### **Access daily LeetCode Solutions Repo :** [click here](https://github.com/withaarzoo/LeetCode-Solutions)

---

![image.png](https://assets.leetcode.com/users/images/95457e90-c428-4b16-898f-a1a2a0b6d074_1728086655.619853.png)


---

# Intuition
The problem is about checking if one string `s2` contains any permutation of another string `s1`. Since permutations of a string have the same character frequency, the idea is to compare the character frequencies of a sliding window of size `s1.length()` in `s2` with the character frequencies of `s1`.

---

# Approach
1. Create frequency arrays for both `s1` and the first window of size `s1.length()` in `s2`.
2. Slide the window across `s2` by one character at a time, updating the window\'s frequency counts.
3. Compare the frequency arrays after each slide. If they match, it means a permutation of `s1` is found in `s2`.

---

# Complexity
- **Time complexity**:  
  $$O(n)$$, where \\(n\\) is the length of `s2`. We traverse `s2` once, updating the frequency array in constant time.

- **Space complexity**:  
  $$O(1)$$. The space used is constant because we only store two frequency arrays of fixed size (26 for lowercase letters).

---

# Code
```C++ []
class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        if (s1.length() > s2.length()) return false;

        vector<int> s1Count(26, 0), s2Count(26, 0);
        
        // Count frequencies of s1 and the first window in s2
        for (int i = 0; i < s1.length(); ++i) {
            s1Count[s1[i] - \'a\']++;
            s2Count[s2[i] - \'a\']++;
        }

        // Slide the window over s2
        for (int i = 0; i < s2.length() - s1.length(); ++i) {
            if (s1Count == s2Count) return true;
            // Update the window
            s2Count[s2[i] - \'a\']--;
            s2Count[s2[i + s1.length()] - \'a\']++;
        }

        // Check the last window
        return s1Count == s2Count;
    }
};

```
```Java []
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        // Count the frequency of characters in s1 and the first window of s2
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - \'a\']++;
            s2Count[s2.charAt(i) - \'a\']++;
        }

        // Slide the window over s2
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (matches(s1Count, s2Count)) return true;
            // Update the window
            s2Count[s2.charAt(i) - \'a\']--;
            s2Count[s2.charAt(i + s1.length()) - \'a\']++;
        }

        // Check the last window
        return matches(s1Count, s2Count);
    }

    private boolean matches(int[] s1Count, int[] s2Count) {
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] != s2Count[i]) return false;
        }
        return true;
    }
}

```
```JavaScript []
var checkInclusion = function(s1, s2) {
    if (s1.length > s2.length) return false;

    let s1Count = Array(26).fill(0);
    let s2Count = Array(26).fill(0);

    // Initialize counts for s1 and the first window in s2
    for (let i = 0; i < s1.length; i++) {
        s1Count[s1.charCodeAt(i) - 97]++;
        s2Count[s2.charCodeAt(i) - 97]++;
    }

    // Slide the window over s2
    for (let i = 0; i < s2.length - s1.length; i++) {
        if (matches(s1Count, s2Count)) return true;
        s2Count[s2.charCodeAt(i) - 97]--;
        s2Count[s2.charCodeAt(i + s1.length) - 97]++;
    }

    // Check the last window
    return matches(s1Count, s2Count);
};

function matches(s1Count, s2Count) {
    for (let i = 0; i < 26; i++) {
        if (s1Count[i] !== s2Count[i]) return false;
    }
    return true;
}

```
```Python []
class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False

        s1Count = [0] * 26
        s2Count = [0] * 26

        # Initialize frequency counts for s1 and the first window in s2
        for i in range(len(s1)):
            s1Count[ord(s1[i]) - ord(\'a\')] += 1
            s2Count[ord(s2[i]) - ord(\'a\')] += 1

        # Slide the window over s2
        for i in range(len(s2) - len(s1)):
            if s1Count == s2Count:
                return True
            s2Count[ord(s2[i]) - ord(\'a\')] -= 1
            s2Count[ord(s2[i + len(s1)]) - ord(\'a\')] += 1

        # Check the last window
        return s1Count == s2Count

```
```Go []
func checkInclusion(s1 string, s2 string) bool {
    if len(s1) > len(s2) {
        return false
    }

    s1Count := make([]int, 26)
    s2Count := make([]int, 26)

    // Initialize counts for s1 and the first window of s2
    for i := 0; i < len(s1); i++ {
        s1Count[s1[i]-\'a\']++
        s2Count[s2[i]-\'a\']++
    }

    // Slide the window over s2
    for i := 0; i < len(s2)-len(s1); i++ {
        if match(s1Count, s2Count) {
            return true
        }
        s2Count[s2[i]-\'a\']--
        s2Count[s2[i+len(s1)]-\'a\']++
    }

    // Check the last window
    return match(s1Count, s2Count)
}

func match(a, b []int) bool {
    for i := 0; i < 26; i++ {
        if a[i] != b[i] {
            return false
        }
    }
    return true
}

```

---

# Step-by-Step Detailed Explanation

1. **Frequency Array Initialization**:
   - We create two frequency arrays of size 26, one for `s1` and one for `s2`. Each index of the array corresponds to a letter in the alphabet.
   - We populate the arrays with the character counts of `s1` and the first window in `s2` (of size `s1.length()`).

2. **Sliding Window**:
   - We start with the first window in `s2` and slide it over the string.
   - For each slide, we remove the frequency count of the character that\u2019s leaving the window and add the frequency count of the new character entering the window.

3. **Frequency Comparison**:
   - At each step of the sliding window, we compare the frequency arrays of the current window and `s1`. If they match, we know that the window is a permutation of `s1`.

4. **Return Result**:
   - If we find a matching window, we return `true`.
   - If no matching window is found after sliding through all of `s2`, we return `false`.

---

### Visualization

We visualize the **sliding window** process by moving a fixed-size window (equal to the length of `s1`) over `s2`. At each step, we compare the frequency of characters in the window with the frequency of characters in `s1`. If the frequencies match, we know that a permutation of `s1` is found within `s2`.

Here\u2019s how it looks:

```
s1 = "ab"     --> Frequency of s1: [a: 1, b: 1]

s2 = "eidbaooo"
Window 1:  "ei"  --> No match
Window 2:  "id"  --> No match
Window 3:  "db"  --> No match
Window 4:  "ba"  --> Match! (Permutation found)
```

---

![upvote cat.png](https://assets.leetcode.com/users/images/28b71bea-3754-44ca-9726-1e5057aa6d2a_1728086883.7634163.png)


</details>
