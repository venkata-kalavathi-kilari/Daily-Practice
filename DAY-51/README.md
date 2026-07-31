# Sort an Array of 0s, 1s, and 2s (Dutch National Flag Algorithm)

## Problem
Given an array `arr[]` containing only `0`s, `1`s, and `2`s, sort the array in ascending order without using any extra space.

## Algorithm
1. Initialize three pointers:
   - `lo = 0` (beginning of the array)
   - `mid = 0` (current element)
   - `hi = n - 1` (end of the array)
2. Traverse the array while `mid <= hi`.
3. If `arr[mid] == 0`:
   - Swap `arr[lo]` and `arr[mid]`.
   - Increment both `lo` and `mid`.
4. If `arr[mid] == 1`:
   - Increment `mid`.
5. If `arr[mid] == 2`:
   - Swap `arr[mid]` and `arr[hi]`.
   - Decrement `hi`.
6. Continue until `mid` crosses `hi`.
## Example
### Input
arr = [0, 2, 1, 2, 0, 1]

### Output
[0, 0, 1, 1, 2, 2]

### Explanation
The array contains only `0`, `1`, and `2`. Using the Dutch National Flag Algorithm, all `0`s are moved to the beginning, `1`s remain in the middle, and `2`s are moved to the end, resulting in a sorted array.

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**
