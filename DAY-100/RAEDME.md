# Upper Bound

## Problem

Given a sorted array and a target value, find the index of the **first element that is greater than the target**.

If no element is greater than the target, return the length of the array.

## Algorithm

1. Traverse the array from left to right.
2. For each element, check if it is greater than `target`.
3. If `arr[i] > target`, return index `i`.
4. If no element is greater than the target, return `n`.

## Example

### Input
arr = [1, 2, 4, 4, 6, 8]
target = 4

### Output
4

## Time Complexity

**O(n)** 

## Space Complexity

**O(1)** 
