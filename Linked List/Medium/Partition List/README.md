# Partition List

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **Language** | java |
| **Solved On** | November 26, 2026 |
| **Tags** | Linked List, Two Pointers |
| **Link** | [View Problem](https://leetcode.com/problems/partition-list/) |
| **Runtime** | 0 ms |
| **Memory** | 43.4 MB |

## Problem Description

<p>Given the <code>head</code> of a linked list and a value <code>x</code>, partition it such that all nodes <strong>less than</strong> <code>x</code> come before nodes <strong>greater than or equal</strong> to <code>x</code>.</p>

<p>You should <strong>preserve</strong> the original relative order of the nodes in each of the two partitions.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/01/04/partition.jpg" style="width: 662px; height: 222px;">
<pre><strong>Input:</strong> head = [1,4,3,2,5,2], x = 3
<strong>Output:</strong> [1,2,2,4,3,5]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> head = [2,1], x = 2
<strong>Output:</strong> [1,2]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the list is in the range <code>[0, 200]</code>.</li>
	<li><code>-100 &lt;= Node.val &lt;= 100</code></li>
	<li><code>-200 &lt;= x &lt;= 200</code></li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: [Java/C++] Detailed Explanation
**Author**: [@hi-malik](https://leetcode.com/hi-malik/)
**Upvotes**: 282 👍
**Link**: [View Original Post](https://leetcode.com/problems/partition-list/solutions/2315494/)

---

So, this problem is super-easy trust me. Only if you know the Basics of LinkedList. 
```
Anyways, Ladies-N-Gentlemen let\'s understand this problem
```

Let\'s understand what  the problem is saying, first of all.
> We have given a list and a value **x**, we have to partion the list in such that smaller value then **x** comes to **left** & greater or equals to **right**. 

So, to do that. One clear thing is coming up in your mind, Why don\'t we create **2 sublists**.
* **Left dummy linked list**
* **Right dummy linked list**

I mean yes, we are doing that. You guy\'s are clever. And if you all have think about this as well, **`Left will have values smaller then x`** & **`Right will have value greater or equal to x`**.

So, let\'s take an example and solve this problem.

```
Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]
```

**Let\'s understand it visually ;**

![image](https://assets.leetcode.com/users/images/e64ba2fb-18b3-461b-bec1-a886109e913b_1658458237.6596422.gif)


Now as you can see when we have seperated the list\'s as per the questions, our final job is to merge them into one list.

So, to do that what we gonna do is, tecnically **`left list`** end i.e. **2** is pointing to **`null`** and **`right list`** end i.e. **5** pointing to **`2`**. But we want **`2`** to point to the beginning of **`right list`** not null.
if we do that we will create a infine[never ending] loop. **Let\'s see what am talking about**

![image](https://assets.leetcode.com/users/images/ba24a36f-f73a-4398-95a8-2e21b8198d07_1658459944.800071.gif)


To, solve this issue what we gonna do is, we want the **`right list`** **5** to point to **null** not to **2**. If we do that then, out list will look\'s like this:
![image](https://assets.leetcode.com/users/images/774f4663-93da-40c3-ad95-16b14bd85ad6_1658458969.4673235.png)

And by doing that we will get our final list, as shown in the question that\'s what we want.

Now, **ladies-n-gentlemen** let\'s code this solution

**Java**
```
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        
        ListNode leftTail = left;
        ListNode rightTail = right;
        
        while(head != null){
            if(head.val < x){
                leftTail.next = head;
                leftTail = leftTail.next;
            }
            else{
                rightTail.next = head;
                rightTail = rightTail.next;
            }
            head = head.next;
        }
        
        leftTail.next = right.next;
        rightTail.next = null;
        
        return left.next;
    }
}
```
**C++**
```
class Solution {
public:
    ListNode* partition(ListNode* head, int x) {
        ListNode *left = new ListNode(0);
        ListNode *right = new ListNode(0);
        
        ListNode *leftTail = left;
        ListNode *rightTail = right;
        
        while(head != NULL){
            if(head->val < x){
                leftTail->next = head;
                leftTail = leftTail->next;
            }
            else{
                rightTail->next = head;
                rightTail = rightTail->next;
            }
            head = head->next;
        }
        
        leftTail->next = right->next;
        rightTail->next = NULL;
        
        return left->next;
    }
};
```
ANALYSIS:-
* **Time Complexity :-** **`BigO(N)`**

* **Space Complexity :-** **`BigO(1)`**

</details>
