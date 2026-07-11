# Minimum Difference in an Array

## Problem
Given an integer array `arr[]`, find the minimum absolute difference between any two elements in the array.

## Algorithm
1. Sort the array in ascending order.
2. Initialize `diff` with `Integer.MAX_VALUE`.
3. Traverse the sorted array from index `0` to `n - 2`.
4. Calculate the difference between adjacent elements.
5. Update `diff` if the current difference is smaller.
6. Return `diff`.


## Example 1

### Input

arr = [5, 3, 8, 2, 9]

### Output
1

### Explanation
After sorting, the array becomes `[2, 3, 5, 8, 9]`.  
The adjacent differences are `1, 2, 3, 1`.  
The minimum difference is `1`.

## Time Complexity
- **O(n log n)** (due to sorting)

## Space Complexity
- **O(1)** (ignoring the space used by the sorting algorithm)
