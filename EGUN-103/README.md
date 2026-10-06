# Find Minimum in Rotated Sorted Array

## Problem

Given a sorted array that has been rotated, find the **minimum element** in the array.

The solution uses **binary search** to find the minimum efficiently.

## Algorithm

1. Initialize:
   - `low = 0`
   - `high = n - 1`
   - `ans = Integer.MAX_VALUE`
2. Perform binary search while `low <= high`.
3. Calculate `mid`.
4. If `arr[low] <= arr[mid]`:
   - The left part is sorted.
   - The minimum in this part is `arr[low]`.
   - Update `ans`.
   - Search the right part.
5. Otherwise:
   - The minimum lies in the unsorted/right part.
   - Update `ans` using `arr[mid]`.
   - Search the left part.
6. Return `ans`.

## Example

### Input
arr = [4, 5, 6, 7, 0, 1, 2]

### Output
0

## Time Complexity

**O(log n)** 

## Space Complexity

**O(1)** 
