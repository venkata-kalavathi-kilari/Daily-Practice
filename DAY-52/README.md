# H-Index

## Problem
Given an array `citations[]`, where `citations[i]` represents the number of citations for a research paper, find the researcher's **H-Index**.

The **H-Index** is the largest value `h` such that the researcher has at least `h` papers with **at least `h` citations** each.

## Algorithm
1. Sort the citations array in ascending order.
2. Initialize `idx = 0`.
3. Traverse the array from the end (highest citations).
4. While:
   - `idx < n`, and
   - the current citation count is greater than `idx`,
   increment `idx`.
5. Return `idx` as the H-Index.

## Example 1

### Input

citations = [3, 0, 6, 1, 5]
### Output
3

### Explanation
After sorting:
[0, 1, 3, 5, 6]

Checking from the end:

- 6 > 0 → `idx = 1`
- 5 > 1 → `idx = 2`
- 3 > 2 → `idx = 3`
- 1 > 3 → False

So, the H-Index is **3**.

## Time Complexity
- **O(n log n)** due to sorting.

## Space Complexity
- **O(1)** auxiliary space, excluding the sorting implementation.
