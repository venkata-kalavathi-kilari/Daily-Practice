# Kth Missing Positive Number

## Problem

Given a sorted array of positive integers and an integer `k`, find the **kth missing positive number** that does not appear in the array.

## Algorithm

1. Initialize `low = 0` and `high = arr.length - 1`.
2. Perform binary search while `low <= high`.
3. Calculate `mid`.
4. Find the number of missing positive integers before `arr[mid]` using:

   `missing = arr[mid] - (mid + 1)`

5. If `missing < k`, search the right half by setting `low = mid + 1`.
6. Otherwise, search the left half by setting `high = mid - 1`.
7. After binary search, return `high + 1 + k`.

## Example

### Input
arr = [2, 3, 4, 7, 11]
k = 5
### Output
9
## Time Complexity

**O(log n)** 

## Space Complexity

**O(1)** 
