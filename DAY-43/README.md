# Minimize the Maximum Difference Between Heights

## Problem
Given an array `arr[]` representing the heights of towers and an integer `k`, modify each tower height by either adding `k` or subtracting `k` exactly once.

Find the minimum possible difference between the maximum and minimum tower heights after the modifications.

A tower height cannot become negative.

## Algorithm
1. Sort the array in ascending order.
2. Initially, calculate the difference between the largest and smallest heights.
3. Iterate through the array and consider each index as a possible dividing point:
   - Towers before the index are increased by `k`.
   - Towers from the index onward are decreased by `k`.
4. Skip the case where `arr[i] - k < 0`.
5. Calculate the new minimum height and maximum height.
6. Update the answer with the minimum difference found.

## Example

### Input
arr = [1, 5, 8, 10]
k = 2


### Output
5

### Explanation
After sorting:
[1, 5, 8, 10]


By adding or subtracting `2` appropriately, the heights can be adjusted to reduce the difference between the tallest and shortest towers.

The minimum possible difference is:
5

## Time Complexity
- **O(n log n)** due to sorting.

## Space Complexity
- **O(1)** auxiliary space, excluding the sorting implementation.
