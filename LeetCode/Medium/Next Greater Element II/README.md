# Next Greater Element II

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **Language** | java |
| **Solved On** | October 26, 2026 |
| **Tags** | Array, Stack, Monotonic Stack |
| **Link** | [View Problem](https://leetcode.com/problems/next-greater-element-ii/) |
| **Runtime** | 18 ms |
| **Memory** | 47.8 MB |

## Problem Description

<p>Given a circular integer array <code>nums</code> (i.e., the next element of <code>nums[nums.length - 1]</code> is <code>nums[0]</code>), return <em>the <strong>next greater number</strong> for every element in</em> <code>nums</code>.</p>

<p>The <strong>next greater number</strong> of a number <code>x</code> is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return <code>-1</code> for this number.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [1,2,1]
<strong>Output:</strong> [2,-1,2]
Explanation: The first 1's next greater number is 2; 
The number 2 can't find next greater number. 
The second 1's next greater number needs to search circularly, which is also 2.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [1,2,3,4,3]
<strong>Output:</strong> [2,3,4,-1,4]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: Java Damn Easy to Understand
**Author**: [@rohitkumarsingh369](https://leetcode.com/rohitkumarsingh369/)
**Upvotes**: 65 👍
**Link**: [View Original Post](https://leetcode.com/problems/next-greater-element-ii/solutions/1449789/)

---

**Time Complexity : O(n)**
**Space Complexity : O(n)**
```
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        Stack<Integer> stack=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            stack.push(nums[i]);
        }
        
        for(int i=nums.length-1;i>=0;i--){
            int number=nums[i];
                while(!stack.isEmpty() && stack.peek()<=nums[i]){
                    stack.pop();
                }
           
            nums[i]=stack.empty()?-1:stack.peek();
            stack.push(number);
        }
        
        return nums;
    }
}
```

**Time Complexity : O(n)**
**Space Complexity : O(n)**
```
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        Stack<Integer> stack=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            stack.push(nums[i]);
        }
        
        int greater[]=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=nums[i]){
                    stack.pop();
                }
            greater[i]=stack.empty()?-1:stack.peek();
            stack.push(nums[i]);
        }
        
        return greater;
    }
}
```

</details>
