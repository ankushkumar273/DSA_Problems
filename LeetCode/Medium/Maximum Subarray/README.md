# Maximum Subarray

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **Language** | java |
| **Solved On** | November 11, 2026 |
| **Tags** | Array, Divide and Conquer, Dynamic Programming |
| **Link** | [View Problem](https://leetcode.com/problems/maximum-subarray/) |
| **Runtime** | 1 ms |
| **Memory** | 76.8 MB |

## Problem Description

<p>Given an integer array <code>nums</code>, find the <span data-keyword="subarray-nonempty" class=" cursor-pointer relative text-dark-blue-s text-sm"><button type="button" aria-haspopup="dialog" aria-expanded="false" aria-controls="radix-_r_t_" data-state="closed" class="" fdprocessedid="lw61rs">subarray</button></span> with the largest sum, and return <em>its sum</em>.</p>

<p>&nbsp;</p>
<p><span class="float-right -my-0.5 ml-2 inline-flex select-none items-center" data-example-lang-controls=""><span role="group" class="inline-flex h-6 items-center rounded-sd-md bg-sd-muted p-0.5" data-example-lang-toggle=""><button type="button" aria-pressed="true" class="h-5 max-w-[10rem] truncate whitespace-nowrap rounded-sd-sm border px-2 text-xs font-normal leading-none border-sd-border bg-sd-background text-sd-foreground" fdprocessedid="i6ttsi">Original</button><button type="button" aria-pressed="false" class="h-5 max-w-[10rem] truncate whitespace-nowrap rounded-sd-sm border px-2 text-xs font-normal leading-none border-transparent text-sd-muted-foreground hover:text-sd-foreground" fdprocessedid="jr1a6s">Java</button></span></span><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [-2,1,-3,4,-1,2,1,-5,4]
<strong>Output:</strong> 6
<strong>Explanation:</strong> The subarray [4,-1,2,1] has the largest sum 6.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [1]
<strong>Output:</strong> 1
<strong>Explanation:</strong> The subarray [1] has the largest sum 1.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> nums = [5,4,-1,7,8]
<strong>Output:</strong> 23
<strong>Explanation:</strong> The subarray [5,4,-1,7,8] has the largest sum 23.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong> If you have figured out the <code>O(n)</code> solution, try coding another solution using the <strong>divide and conquer</strong> approach, which is more subtle.</p>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: JAVA | Kadane's Algorithm | Explanation Using Image
**Author**: [@Chaitanya1706](https://leetcode.com/Chaitanya1706/)
**Upvotes**: 971 👍
**Link**: [View Original Post](https://leetcode.com/problems/maximum-subarray/solutions/1595097/)

---

**Intution:** Start traversing your array keep each element in the sum and every time keep the max of currSum and prevSum.
**But the catch here is that if at any point sum becomes negative then no point keeping it because 0 is obviously greater than negative, so just make your sum 0.**

![image](https://assets.leetcode.com/users/images/2715e7ab-8fad-4f5f-ace9-cfe83acba68f_1637809592.7767313.jpeg)

Now here in this question you can see that you can also be asked some more things like :
* Length of the max subarray
* Elements of the max subarray
* Start and End index of max subarray
  ##### This is very important concept from interview point so try to get the ans of above mentioned point and have confidence on this algorithm.

**CODE :**
```
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int i=0;i<n;i++){
            sum += nums[i];
            max = Math.max(sum,max);
            
            if(sum<0) sum = 0;
        }
        
        return max;
    }
}
```
P.S. : I see a lots of comments saying this algorithm will not work if all the elements are negative....plz analyze it carefully...this is working for every case. 
**if(sum<0) sum = 0;** -> this line is doing some magic. Dry run the algorithm carefully and u will get the answer. 


</details>
