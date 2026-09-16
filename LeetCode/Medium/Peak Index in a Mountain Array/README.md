# Peak Index in a Mountain Array

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **Language** | java |
| **Solved On** | September 16, 2026 |
| **Tags** | Array, Binary Search, Ternary Search |
| **Link** | [View Problem](https://leetcode.com/problems/peak-index-in-a-mountain-array/) |
| **Runtime** | 1 ms |
| **Memory** | 80.1 MB |

## Problem Description

<p>You are given an integer <strong>mountain</strong> array <code>arr</code> of length <code>n</code> where the values increase to a <strong>peak element</strong> and then decrease.</p>

<p>Return the index of the peak element.</p>

<p>Your task is to solve it in <code>O(log(n))</code> time complexity.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">arr = [0,1,0]</span></p>

<p><strong>Output:</strong> <span class="example-io">1</span></p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">arr = [0,2,1,0]</span></p>

<p><strong>Output:</strong> <span class="example-io">1</span></p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">arr = [0,10,5,2]</span></p>

<p><strong>Output:</strong> <span class="example-io">1</span></p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>3 &lt;= arr.length &lt;= 10<sup>5</sup></code></li>
	<li><code>0 &lt;= arr[i] &lt;= 10<sup>6</sup></code></li>
	<li><code>arr</code> is <strong>guaranteed</strong> to be a mountain array.</li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: ✅ Beats 100% users ⬆️ Proved 🧠 Easy to understand with comments in each line  ♻️
**Author**: [@trishitchar](https://leetcode.com/trishitchar/)
**Upvotes**: 38 👍
**Link**: [View Original Post](https://leetcode.com/problems/peak-index-in-a-mountain-array/solutions/3815266/)

---

![Screenshot 2023-07-25 205838.png](https://assets.leetcode.com/users/images/84a7330a-b3c1-4c3f-85e1-1cf74c661705_1690299671.0612407.png)
# Intuition Approach
- **Described** **in** **code** segments each line by line with comments
- ```The ios_base::sync_with_stdio(false);``` 
line is used to disable synchronization between C and C++ standard streams (cin and cout).
This can lead to faster I/O performance.

- ```The cin.tie(NULL);``` 
line unties the cin from cout. This also helps in faster input reading.

# Complexity
- Time complexity: ```log(n)```

- Space complexity: ```O(1)```

# Code
```C++ []
class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
        
    // Disable synchronization between C and C++ standard streams for faster I/O
    ios_base::sync_with_stdio(false);

    // Untie cin from cout for faster input reading
    cin.tie(NULL);

    int low = 0; // low index of the array
    int high = arr.size() - 1; // high index of the array

    // Perform binary search until low and high pointers converge
    while (low < high) {
        // Calculate the middle index of the current search range
        int mid = low + (high - low) / 2;

        // Check if the middle element is smaller than the element to its right
        if (arr[mid] < arr[mid + 1]) {
            // If it is, move the low pointer to the right of the middle element
            low = mid + 1;
        }
        // Check if the middle element is larger than the element to its right
        else if (arr[mid] > arr[mid + 1]) {
            // If it is, move the high pointer to the middle element
            // Since the middle element is already larger than the next one, it might be a potential peak
            high = mid;
        }
    }

    // When the while loop exits, low and high will be pointing to the same index,
    // which is the potential peak element
    return low; // Return the index of the peak element
        
    }
};
```
```java []
public class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {
                high = mid;
            }
        }

        return low;
    }
}
```
```python []
class Solution:
    def peakIndexInMountainArray(self, arr):
        low = 0
        high = len(arr) - 1

        while low < high:
            mid = low + (high - low) // 2

            if arr[mid] < arr[mid + 1]:
                low = mid + 1
            elif arr[mid] > arr[mid + 1]:
                high = mid

        return low

```



</details>
