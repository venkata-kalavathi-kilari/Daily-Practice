# Find Peak Element in a Mountain Array

## Problem

Given an array that first increases and then decreases, find the index of the peak element using binary search.

A peak element is an element that is greater than its neighboring elements.

## Algorithm

1. Initialize `low = 0` and `high = n - 1`.
2. Apply binary search while `low <= high`.
3. Calculate `mid = (low + high) / 2`.
4. If `arr[mid] < arr[mid + 1]`, the array is increasing, so move right by setting `low = mid + 1`.
5. Otherwise, move left by setting `high = mid - 1`.
6. When the loop ends, return `low`, which represents the peak index for a valid mountain array.

## Example

### Input
5
0 2 5 3 1

### Output
2
## Time Complexity

**O(log n)** — Binary search reduces the search range in each iteration.

## Space Complexity

**O(1)** auxiliary space — Only a constant number of extra variables are used.
