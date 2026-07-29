# Minimum Number of Subsets

## Problem
Given an integer array `arr[]`, divide the elements into the minimum number of subsets such that each subset contains consecutive integers. Return the minimum number of subsets required.

## Algorithm
1. Sort the array in ascending order.
2. Initialize `count = 1` since at least one subset is required.
3. Traverse the sorted array.
4. If the next element is not equal to the current element plus `1`, start a new subset by incrementing `count`.
5. Return `count`.

## Example

### Input
arr = [1, 2, 3, 5, 6, 8]

### Output
3
### Explanation
After sorting:
[1, 2, 3, 5, 6, 8]

The subsets are:

[1, 2, 3]
[5, 6]
[8]

Hence, the minimum number of subsets required is `3`.

## Time Complexity
- **O(n log n)** due to sorting.

## Space Complexity
- **O(1)** auxiliary space, excluding the sorting implementation.
