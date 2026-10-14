# Search in Rotated Sorted Array with Duplicates

## Problem

Given a rotated sorted array that may contain duplicate elements, search for a given `key`.

- Return `true` if the key is present.
- Return `false` if the key is not present.

## Algorithm

1. Initialize `l = 0` and `r = arr.length - 1`.
2. Perform binary search while `l <= r`.
3. Calculate the middle index using `mid = l + (r - l) / 2`.
4. If `arr[mid] == key`, return `true`.
5. If `arr[l] == arr[mid] == arr[r]`:
   - Increment `l`.
   - Decrement `r`.
   - Continue searching.
6. If the left half is sorted (`arr[l] <= arr[mid]`):
   - Check whether the key lies between `arr[l]` and `arr[mid]`.
   - If yes, search the left half.
   - Otherwise, search the right half.
7. Otherwise, the right half is sorted:
   - Check whether the key lies between `arr[mid]` and `arr[r]`.
   - If yes, search the right half.
   - Otherwise, search the left half.
8. If the key is not found, return `false`.

## Example 1

### Input

arr = [2, 5, 6, 0, 0, 1, 2]
key = 0

### Output
true

## Space Complexity

**O(1)** — Only a constant number of variables are used.

