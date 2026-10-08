# Find Number of Rotations

## Problem

Given a sorted array that has been rotated, find the **number of times the array has been rotated**.

The number of rotations is equal to the **index of the minimum element**.

## Algorithm

1. Initialize:
   - `low = 0`
   - `high = n - 1`
   - `ans = Integer.MAX_VALUE`
   - `index = -1`
2. Perform binary search while `low <= high`.
3. If `arr[low] <= arr[high]`:
   - The current range is completely sorted.
   - `arr[low]` is the minimum element.
   - Store its index and stop.
4. If the left half is sorted (`arr[low] <= arr[mid]`):
   - The minimum may be `arr[low]`.
   - Store its index.
   - Search the right half.
5. Otherwise:
   - The minimum lies around `mid`.
   - Store `mid` as the possible minimum index.
   - Search the left half.
6. Return `index`.
## Example

### Input

arr = [4, 5, 1, 2, 3]

### Output
2

## Time Complexity

**O(log n)** 

## Space Complexity

**O(1)**

