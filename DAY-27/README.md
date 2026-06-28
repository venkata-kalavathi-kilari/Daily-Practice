# Lower Bound in Sorted Array

## Problem
Given a sorted array `arr[]` (0-based indexing) and a target value, find the **lower bound** of the target.

The lower bound is the **smallest index** such that:
arr[i] >= target

If no such element exists, return `arr.length`.

## Algorithm

1. Set low = 0, high = n - 1, answer = n

2. While low <= high:
   - Find mid = (low + high) / 2
   - If arr[mid] >= target:
        answer = mid
        high = mid - 1
   - Else:
        low = mid + 1

3. Return answer

## Example 1
### Input
arr = [2, 3, 7, 10, 11, 11, 25], target = 9


### Output
3


### Explanation
`arr[3] = 10` is the first element ≥ 9.

## Time Complexity
- **O(log n)** (binary search)

## Space Complexity
- **O(1)** (constant extra space)
