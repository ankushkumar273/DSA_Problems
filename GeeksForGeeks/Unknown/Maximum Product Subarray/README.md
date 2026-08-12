# Maximum Product Subarray

| Field | Value |
|-------|-------|
| **Platform** | GeeksForGeeks |
| **Difficulty** | Unknown |
| **Language** | cpp |
| **Solved On** | August 12, 2026 |
| **Link** | [View Problem](https://www.geeksforgeeks.org/problems/maximum-product-subarray3604/1) |

## Approach

Maximum Product Subarray — Revision Points
Goal: Continuous subarray ka maximum product find karna.
Normal Kadane ki tarah current subarray continue karo ya new subarray start karo.
Product mein 2 values maintain karo:
maxProduct
minProduct
minProduct important hai because:
negative × negative = positive
Agar curr < 0, toh maxProduct aur minProduct swap karo.

Maximum ke liye:

maxProduct = Math.max(curr, maxProduct * curr);

Minimum ke liye:

minProduct = Math.min(curr, minProduct * curr);

Har step par global answer update karo:

answer = Math.max(answer, maxProduct);
arr[0] se initialize karo, isliye loop i = 1 se start karo.
Time: O(n)
Space: O(1)
