# Missing Number in an Array

## Problem

Given an array `arr[]` containing `n - 1` distinct integers from `1` to `n`, find the **missing number**.

## Example

### Input
arr[] = [1, 2, 4, 5]

### Output
3

## Algorithm

1. Find `n` using `arr.length + 1`.
2. Calculate the sum of numbers from `1` to `n` using:
   `n * (n + 1) / 2`
3. Calculate the sum of all elements in the array.
4. Subtract the array sum from the total sum.
5. The result is the missing number.

## Time Complexity
- **O(n)**
## Space Complexity
- **O(1)**
