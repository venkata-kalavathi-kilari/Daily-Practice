# Search in Rotated Sorted Array

## Problem

Given a sorted array that has been rotated at some pivot, search for a given `key`.

Return the index of `key` if it is present in the array. Otherwise, return `-1`.

## Algorithm

1. Initialize `low = 0` and `high = n - 1`.
2. Perform binary search while `low <= high`.
3. Calculate `mid`.
4. If `arr[mid] == key`, return `mid`.
5. Check which half is sorted:
   - If `arr[low] <= arr[mid]`, the left half is sorted.
   - Otherwise, the right half is sorted.
6. If the left half is sorted:
   - Check whether `key` lies between `arr[low]` and `arr[mid]`.
   - If yes, search the left half.
   - Otherwise, search the right half.
7. If the right half is sorted:
   - Check whether `key` lies between `arr[mid]` and `arr[high]`.
   - If yes, search the right half.
   - Otherwise, search the left half.
8. If the element is not found, return `-1`.
## Example

### Input
arr = [4, 5, 6, 7, 0, 1, 2]
key = 0

### Output
4

## Time Complexity

**O(log n)** 

## Space Complexity

**O(1)** 
