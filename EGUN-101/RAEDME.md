# Search Insert Position

## Problem

Given a sorted array and an integer `k`, find the index where `k` should be inserted so that the array remains sorted.

If `k` is already present, return its first occurrence index.

## Algorithm

1. Initialize `low = 0` and `high = arr.length - 1`.
2. Set `ans = arr.length`.
3. Apply binary search while `low <= high`.
4. Calculate `mid`.
5. If `arr[mid] >= k`:
   - Store `mid` as the possible answer.
   - Search the left half for an earlier valid position.
6. Otherwise, search the right half.
7. Return `ans`.
## Example

### Input
arr = [1, 3, 5, 6]
k = 5

### Output
2

## Time Complexity

**O(log n)** 

## Space Complexity

**O(1)**
