# Find Maximum Element

## Problem

Given an array of integers, find and return the **maximum element** in the array.

## Algorithm

1. Initialize `max` with the first element of the array.
2. Traverse the array.
3. Compare each element with `max`.
4. If the current element is greater than `max`, update `max`.
5. Return `max`.
6. 
## Example

### Input
arr = [10, 25, 7, 40, 15]

### Output
40
## Time Complexity

**O(n)** — The array is traversed once.

## Space Complexity

**O(1)** — Only the `max` variable is used.
