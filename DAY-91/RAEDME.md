# Maximum Subarray Sum

## Problem
Given an array of integers, find the contiguous subarray with the maximum sum and return its sum.

## Algorithm
1. Initialize `res` and `maxEnd` with the first element of the array.
2. Traverse the array from the second element.
3. For each element, decide whether to:
   - Start a new subarray from the current element.
   - Add the current element to the existing subarray.
4. Store the maximum sum ending at the current position in `maxEnd`.
5. Update `res` with the maximum sum found so far.
6. Return `res`.
## Example

### Input
8
-2 1 -3 4 -1 2 1 -5

### Output
6

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**
