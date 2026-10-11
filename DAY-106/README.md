# Floor Square Root Using Binary Search

## Problem

Given a non-negative integer `n`, find and return the **floor of its square root**.

The floor square root is the largest integer whose square is less than or equal to `n`.

## Algorithm

1. Initialize `low = 1`, `high = n`, and `ans = 1`.
2. Perform binary search while `low <= high`.
3. Calculate `mid = (low + high) / 2`.
4. Calculate `val = mid * mid`.
5. If `val <= n`:
   - Store `mid` as the answer.
   - Search the right half for a larger valid square root.
6. Otherwise, search the left half.
7. Return `ans`.

## Example 1

### Input
n = 27

### Output
5
## Time Complexity

**O(log n)** 

## Space Complexity

**O(1)** 
