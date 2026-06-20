# Search Insert Position

## Problem

Given a sorted array `arr[]` and an integer `k`, find the index of `k` if it is present in the array.

If `k` is not present, return the index where it should be inserted to maintain the sorted order.

### Example 1

**Input:**
arr = [1, 3, 5, 6]
k = 5


**Output:**
2


**Explanation:**
5 is present at index 2.

## Algorithm

1. Initialize two pointers:
   - `left = 0`
   - `right = arr.length - 1`
2. Perform Binary Search while `left <= right`.
3. Calculate the middle index:
   ```
   mid = left + (right - left) / 2
   ```
4. If `arr[mid] == k`, return `mid`.
5. If `arr[mid] > k`, search in the left half.
6. Otherwise, search in the right half.
7. If `k` is not found, return `left`, which represents the correct insertion position.

## Time Complexity
O(log n)


## Space Complexity
O(1)
