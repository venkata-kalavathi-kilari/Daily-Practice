# Single Element in a Sorted Array

## Problem

Given a sorted array where every element appears exactly twice except for one element, find the element that appears only once.

The solution uses **binary search** to find the single element efficiently.

## Algorithm

1. If the array contains only one element, return `arr[0]`.
2. If the first element differs from the second element, return `arr[0]`.
3. If the last element differs from the second-last element, return `arr[n - 1]`.
4. Initialize `low = 1` and `high = n - 2`.
5. Perform binary search while `low <= high`.
6. Calculate `mid`.
7. If `arr[mid]` differs from both its neighbors, return `arr[mid]`.
8. Check the pair positions:
   - If `mid` is odd and `arr[mid] == arr[mid - 1]`, search the right half.
   - If `mid` is even and `arr[mid] == arr[mid + 1]`, search the right half.
9. Otherwise, search the left half.
10. If no single element is found, return `-1`.

## Example

### Input
arr = [1, 1, 2, 2, 3, 4, 4, 5, 5]

### Output
3

## Time Complexity

**O(log n)**

## Space Complexity

**O(1)**

