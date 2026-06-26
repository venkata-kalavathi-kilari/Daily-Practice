# Check if an Array is Sorted

## Problem
Given an integer array `arr[]`, determine whether the array is sorted in non-decreasing order. Return `true` if the array is sorted; otherwise, return `false`.

## Algorithm
1. Find the length of the array `n`.
2. Traverse the array from index `1` to `n - 1`.
3. Compare `arr[i - 1]` and `arr[i]`.
4. If `arr[i - 1] > arr[i]`, return `false`.
5. If the loop completes, return `true`.


## Example 1

### Input
arr = [1, 2, 3, 4, 5]
### Output
true

### Explanation
Each element is greater than or equal to the previous element, so the array is sorted.

## Time Complexity
- O(n)

## Space Complexity
- O(1)
