# Remove All Occurrences of a Substring

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **Language** | java |
| **Solved On** | September 24, 2026 |
| **Tags** | String, Stack, Simulation |
| **Link** | [View Problem](https://leetcode.com/problems/remove-all-occurrences-of-a-substring/) |
| **Runtime** | 2 ms |
| **Memory** | 44.2 MB |

## Problem Description

<p>Given two strings <code>s</code> and <code>part</code>, perform the following operation on <code>s</code> until <strong>all</strong> occurrences of the substring <code>part</code> are removed:</p>

<ul>
	<li>Find the <strong>leftmost</strong> occurrence of the substring <code>part</code> and <strong>remove</strong> it from <code>s</code>.</li>
</ul>

<p>Return <code>s</code><em> after removing all occurrences of </em><code>part</code>.</p>

<p>A <strong>substring</strong> is a contiguous sequence of characters in a string.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> s = "daabcbaabcbc", part = "abc"
<strong>Output:</strong> "dab"
<strong>Explanation</strong>: The following operations are done:
- s = "da<strong><u>abc</u></strong>baabcbc", remove "abc" starting at index 2, so s = "dabaabcbc".
- s = "daba<strong><u>abc</u></strong>bc", remove "abc" starting at index 4, so s = "dababc".
- s = "dab<strong><u>abc</u></strong>", remove "abc" starting at index 3, so s = "dab".
Now s has no occurrences of "abc".
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> s = "axxxxyyyyb", part = "xy"
<strong>Output:</strong> "ab"
<strong>Explanation</strong>: The following operations are done:
- s = "axxx<strong><u>xy</u></strong>yyyb", remove "xy" starting at index 4 so s = "axxxyyyb".
- s = "axx<strong><u>xy</u></strong>yyb", remove "xy" starting at index 3 so s = "axxyyb".
- s = "ax<strong><u>xy</u></strong>yb", remove "xy" starting at index 2 so s = "axyb".
- s = "a<strong><u>xy</u></strong>b", remove "xy" starting at index 1 so s = "ab".
Now s has no occurrences of "xy".
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 1000</code></li>
	<li><code>1 &lt;= part.length &lt;= 1000</code></li>
	<li><code>s</code>​​​​​​ and <code>part</code> consists of lowercase English letters.</li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: Java Solution 100 % Faster using Stack code with full explanation!!!
**Author**: [@Akshay0406](https://leetcode.com/Akshay0406/)
**Upvotes**: 49 👍
**Link**: [View Original Post](https://leetcode.com/problems/remove-all-occurrences-of-a-substring/solutions/1299366/)

---

Approach: Step1 : Traverse through the string from 0th index and push the corresponding character in the stack until stack size is not equal part size
Step 2: When stack size is equal part size then traverse through part from last character and check if it is equal to the stack top characater if it is equal then pop from stack and check for next character
Step 3: If stack top is not equal part character then we have to fill the stack again so the inner loop will do that
Step 4 After above 3 steps your stack will remain with the string characters as a result of removal of all substring Now you will make yout string using stringbuilder from stack as shown in last 4 lines of code.

Do upvote if you like the explanation :) !!

 class Solution {
*   		public String removeOccurrences(String s, String part) {
			Stack<Character> st = new Stack<>();
 		int n = s.length();
        int m = part.length();
        for(int i=0;i<n;i++){
            st.push(s.charAt(i));
            if(st.size()>=m){
                String x="";
                for(int j=m-1;j>=0;j--){
                    char ch = part.charAt(j);
                    if(ch!=st.peek()){
                        for(int k=0;k<x.length();k++){
                            st.push(x.charAt(k));
                        }
                        break;
                    }
                    else{
                        x=st.peek()+x;
                        st.pop();
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(st.size()!=0){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}\'\'\'


</details>
