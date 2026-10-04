# Best Time to Buy and Sell Stock

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **Language** | java |
| **Solved On** | October 4, 2026 |
| **Tags** | Array, Dynamic Programming |
| **Link** | [View Problem](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) |
| **Runtime** | 1 ms |
| **Memory** | 94.3 MB |

## Problem Description

<p>You are given an array <code>prices</code> where <code>prices[i]</code> is the price of a given stock on the <code>i<sup>th</sup></code> day.</p>

<p>You want to maximize your profit by choosing a <strong>single day</strong> to buy one stock and choosing a <strong>different day in the future</strong> to sell that stock.</p>

<p>Return <em>the maximum profit you can achieve from this transaction</em>. If you cannot achieve any profit, return <code>0</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> prices = [7,1,5,3,6,4]
<strong>Output:</strong> 5
<strong>Explanation:</strong> Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> prices = [7,6,4,3,1]
<strong>Output:</strong> 0
<strong>Explanation:</strong> In this case, no transactions are done and the max profit = 0.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= prices.length &lt;= 10<sup>5</sup></code></li>
	<li><code>0 &lt;= prices[i] &lt;= 10<sup>4</sup></code></li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: [Java/C++] best-ever EXPLANATION could possible
**Author**: [@hi-malik](https://leetcode.com/hi-malik/)
**Upvotes**: 1416 👍
**Link**: [View Original Post](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/solutions/1735493/)

---

Let\'s understand this problem by an **imagination**. **Imagine** you have given a **time machine**, you can go to **past** to **buy** the **stock** of your choice when the price is very least. And again using that **time machine** you went into **future** to **sell** the **stock**.

![image](https://assets.leetcode.com/users/images/21002ba2-d686-4465-8486-38e3ccd4a063_1643683166.0503008.png)

By doing that you have achieve **maximum profit**. From `buying at very least price and selling at very higher price`. **And you have become rich now!**

![image](https://assets.leetcode.com/users/images/2950d9ce-0000-49dd-8270-cdfbf8a7a6af_1643683545.5999126.png)

Now let\'s just understand it with our given example,
**Input**: prices = [7,1,5,3,6,4]
**Output**: 5

![image](https://assets.leetcode.com/users/images/ca7614a0-a717-48c1-a4ba-7fba42046941_1643684561.8969386.png)

`Remember one rule :- You can only buy one time & sell one time`

* So, if **buy at 7** & **sell at any time in the future**, we\'ll face loss. Because **buying price** is way **higher** then **selling price** available we have
* Now, I have seen a dip & I **buy at 1** & **sell at 5** my **overall profit** will be **5 - 1 = 4**

* But what if, I had **buy at 1** & **sell at 6** my profit will be **6 - 1 = 5**. Which is **greater then my overall profit**. So, i will **update** my **overall profit** with new value.
* Now we have done as further we don\'t have any higher point to sell. We will **return our answer.**

**I hope now question, approach is absolute clear.**

*code each line explained :* `Similar for C++, Java`

```
{
        int lsf = Integer.MAX_VALUE; // least so far
        int op = 0; // overall profit
        int pist = 0; // profit if sold today
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){ // if we found new buy value which is more smaller then previous one
                lsf = prices[i]; // update our least so far
            }
            pist = prices[i] - lsf; // calculating profit if sold today by, Buy - sell
            if(op < pist){ // if pist is more then our previous overall profit
                op = pist; // update overall profit
            }
        }
        return op; // return op 
```

**Java**
```
class Solution {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }
}
```
**C++**
```
class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int lsf = INT_MAX;
        int op = 0;
        int pist = 0;
        
        for(int i = 0; i < prices.size(); i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }
};
```

</details>
