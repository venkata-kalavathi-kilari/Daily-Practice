# Maximize Sum After K Negations

## Problem

Given an array of integers `arr` and an integer `k`, maximize the sum of the array after performing at most `k` operations.

In each operation, you can choose any element and multiply it by `-1`.

## Algorithm

1. Sort the array in ascending order.
2. Traverse the array from the smallest element.
3. If the current element is negative and `k > 0`:
   - Convert the negative element into a positive element.
   - Decrease `k` by 1.
4. Calculate the sum of all elements.
5. Find the minimum absolute value in the array.
6. If the remaining `k` is odd:
   - Subtract twice the minimum absolute value from the sum.
7. Return the maximum sum.
## Example

### Input
arr = [-2, 0, 5, -1]
k = 2

### Output
8
## Time Complexity

**O(n log n)** 

## Space Complexity

**O(1)**
