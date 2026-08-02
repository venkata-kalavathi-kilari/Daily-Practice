# Two Sum

## Problem
Given an integer array `arr[]` and an integer `target`, determine whether there exists a pair of elements whose sum is equal to `target`. Return `true` if such a pair exists; otherwise, return `false`.

## Algorithm
1. Traverse the array using the first loop.
2. For each element, traverse the remaining elements using the second loop.
3. Check if the sum of the current pair equals the target.
4. If a matching pair is found, return `true`.
5. If no such pair exists after checking all pairs, return `false`.

## Example 1

### Input
arr = [2, 7, 11, 15]
target = 9

### Output
true

### Explanation
The pair `(2, 7)` has a sum of `9`, which equals the target.
## Time Complexity
- **O(n²)**

## Space Complexity
- **O(1)**
