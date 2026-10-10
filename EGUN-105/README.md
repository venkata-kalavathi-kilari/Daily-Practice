# Find Peak Element

## Problem

Given an array of integers, find the index of a **peak element**.

A peak element is an element that is greater than its adjacent elements. For boundary elements, only the existing adjacent element is considered.

Return the index of any peak element.

## Algorithm

1. If the array contains only one element, return `0`.
2. If the first element is greater than the second, return `0`.
3. If the last element is greater than the previous element, return `n - 1`.
4. Initialize `low = 1` and `high = n - 2`.
5. Perform binary search while `low <= high`.
6. Calculate `mid`.
7. If `arr[mid]` is greater than both adjacent elements, return `mid`.
8. If `arr[mid] > arr[mid - 1]`, move right by setting `low = mid + 1`.
9. If `arr[mid] > arr[mid + 1]`, move left by setting `high = mid - 1`.
10. Otherwise, move right.
11. Return `-1` if no peak is found.

## Example

### Input
arr = [1, 3, 20, 4, 1, 0]

### Output
2

## Time Complexity

**O(log n)** 

## Space Complexity

**O(1)** 
