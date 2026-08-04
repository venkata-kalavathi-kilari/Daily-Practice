# Count Pairs with Absolute Difference Less Than `k`

## Problem
Given an integer array `arr[]` and an integer `k`, count the number of pairs `(i, j)` such that `i < j` and the absolute difference between the two elements is less than `k`.

## Algorithm
1. Sort the array in ascending order.
2. Initialize two pointers:
   - `i = 0`
   - `j = 1`
3. While `j` is within the array:
   - If `arr[j] - arr[i] < k`:
     - All elements between `i` and `j - 1` form valid pairs with `arr[j]`.
     - Add `(j - i)` to the count.
     - Increment `j`.
   - Otherwise:
     - Increment `i`.
     - If `i` becomes equal to `j`, increment `j`.
4. Return the total count.

## Example

### Input
arr = [1, 3, 5, 6]
k = 3

### Output
4
### Explanation
After sorting:

[1, 3, 5, 6]

The valid pairs are:

(1, 3)
(3, 5)
(3, 6)
(5, 6)

Each pair has a difference less than `3`, so the answer is `4`.

## Time Complexity
- **O(n log n)** due to sorting.

## Space Complexity
- **O(1)** auxiliary space, excluding the sorting implementation.
