# Reverse Integer

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **Language** | cpp |
| **Solved On** | September 29, 2026 |
| **Tags** | Math |
| **Link** | [View Problem](https://leetcode.com/problems/reverse-integer/) |
| **Runtime** | 2 ms |
| **Memory** | 8.6 MB |

## Problem Description

<p>Given a signed 32-bit integer <code>x</code>, return <code>x</code><em> with its digits reversed</em>. If reversing <code>x</code> causes the value to go outside the signed 32-bit integer range <code>[-2<sup>31</sup>, 2<sup>31</sup> - 1]</code>, then return <code>0</code>.</p>

<p><strong>Assume the environment does not allow you to store 64-bit integers (signed or unsigned).</strong></p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> x = 123
<strong>Output:</strong> 321
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> x = -123
<strong>Output:</strong> -321
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> x = 120
<strong>Output:</strong> 21
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>-2<sup>31</sup> &lt;= x &lt;= 2<sup>31</sup> - 1</code></li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: ✅ My C++Solution Beats 100% || 0ms Run time ✅
**Author**: [@ayushkr01](https://leetcode.com/ayushkr01/)
**Upvotes**: 744 👍
**Link**: [View Original Post](https://leetcode.com/problems/reverse-integer/solutions/3099545/)

---

- Linkedin Profile (https://linkedin.com/in/ayush-kumar-a276a124a)
//-------------> \uD83D\uDC7B Pls Upvote if it is helpful for You \uD83D\uDC7B <-----------------//
# Approach
 1. First we decleare a variable r and initilise it to 0
2.  Then each time find remainder Using modulus Operator  
3. Then add remainder to r Lets Understand with example

  
![WhatsApp Image 2023-01-26 at 2.59.34 AM.jpeg](https://assets.leetcode.com/users/images/bc5eef77-1e1f-4202-b0c6-68a62bff490c_1674682266.8555562.jpeg)

 - Then compare The value of  r  to check it is inside the 32-bit   integer range [-2^31, 2^31 - 1]   Then  return r     
 - Otherwise return 0;

<!-- Decribe your approach to solving the problem. -->
    - Space complexity:  O(1) 
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code using 64 bit integer
``` 
class Solution {                      
public:
    int reverse(int x) {
        long r=0;      // decleare r 
        while(x){
         r=r*10+x%10; // find remainder and add its to r
         x=x/10;     // Update the value of x
        }
        if(r>INT_MAX || r<INT_MIN) return 0; // check range if r is outside the range then return 0  
        return int(r);  // if r in the 32 bit range then return r
    }
}; 
``` 
 **   
  
# Code using 32 bit integer
``` 
class Solution {                      
public:
    int reverse(int x) {
        int r=0;      // decleare r 
        while(x){
         if (r>INT_MAX/10 || r<INT_MIN/10) return 0; // check 32 bit range if r is outside the range then return 0 
         r=r*10+x%10; // find remainder and add its to r
         x=x/10;     // Update the value of x
        } 
        return r;  // if r in the 32 bit range then return r
    }
}; 
``` 
 **  
                    

---

* \uD83D\uDC7B IF YOU LIKE THE SOLUTION THEN PLEASE UPVOTE MY SOLUTION BECAUSE IT GIVES ME MOTIVATION TO REGULARLY POST THE SOLUTION\uD83D\uDC7B*
![image.png](https://assets.leetcode.com/users/images/c4590f79-be9c-47da-b9ef-0428c9c509a6_1678435819.387464.png)



</details>
