# Lower Bound

## Problem

Given a sorted array and a target value, find the index of the **first element that is greater than or equal to the target**.

If no such element exists, return the length of the array.

## Algorithm

1. Initialize `low = 0` and `high = arr.length - 1`.
2. Set `ans = arr.length`.
3. Apply binary search while `low <= high`.
4. Calculate the middle index.
5. If `arr[mid] >= target`:
   - Store `mid` as the answer.
   - Search on the left side for an earlier valid index.
6. Otherwise, search on the right side.
7. Return `ans`.

## Example

### Input
arr = [1, 2, 4, 4, 6, 8]
target = 4

### Output
2

## Time Complexity

**O(log n)** 

## Space Complexity

**O(1)**
