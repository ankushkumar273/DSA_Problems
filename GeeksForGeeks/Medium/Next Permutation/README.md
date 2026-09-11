# Next Permutation

| Field | Value |
|-------|-------|
| **Platform** | GeeksForGeeks |
| **Difficulty** | Medium |
| **Language** | cpp |
| **Solved On** | September 11, 2026 |
| **Link** | [View Problem](https://www.geeksforgeeks.org/problems/next-permutation5226/1) |

## Approach

Next Permutation — Steps

Step 1: Find the Pivot

Set pivot = -1.
Start from i = n - 2 and move backwards.
Check:
A[i] < A[i + 1]
If true:
Set pivot = i
Stop the loop (break).

Step 2: If no Pivot is Found

If pivot == -1, it means the array is in descending order.
Reverse the entire array.
Return.

Step 3: Find the Next Greater Element

Start from the last index: i = n - 1.
Move backwards until i > pivot.
Find the first element such that:
A[i] > A[pivot]
Swap:
A[i] and A[pivot].

Step 4: Reverse the Right Part

Set:
i = pivot + 1
j = n - 1
While i <= j:
Swap A[i] and A[j]
i++
j--
