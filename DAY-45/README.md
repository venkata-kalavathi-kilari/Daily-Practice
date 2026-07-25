# Maximum Subarray Sum (Kadane's Algorithm)

## Problem
Given an integer array `arr[]`, find the maximum possible sum of a contiguous subarray.

A contiguous subarray contains elements that are next to each other in the original array.

## Algorithm
1. Initialize `res` with the first element.
2. Initialize `maxEnding` with the first element.
3. Traverse the array from the second element.
4. At each index, choose the maximum between:
   - Starting a new subarray from the current element.
   - Extending the previous subarray.
5. Update the maximum subarray sum.
6. Return the result.

## Example

### Input
arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

### Output
6

### Explanation
The maximum-sum contiguous subarray is:

[4, -1, 2, 1]

Sum:

4 + (-1) + 2 + 1 = 6
Therefore, the maximum subarray sum is `6`.

## Time Complexity
- O(n)

## Space Complexity
- O(1)
