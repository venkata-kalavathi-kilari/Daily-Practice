# Upper Bound in an Array

## Problem
Given a sorted integer array `arr[]` and a target value `target`, find the **upper bound** of the target. The upper bound is the index of the first element that is **strictly greater** than the target. If no such element exists, return the length of the array.

## Algorithm
1. Traverse the array from the beginning.
2. For each element, check if it is greater than the target.
3. If an element greater than the target is found, return its index.
4. If the loop completes without finding such an element, return `n` (the length of the array).

## Example 1

### Input
arr = [1, 2, 4, 4, 5, 7]
target = 4

### Output
4

### Explanation
The first element greater than `4` is `5`, which is at index `4`.

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**
