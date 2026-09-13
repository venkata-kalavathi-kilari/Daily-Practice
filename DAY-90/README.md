# Second Largest Element in an Array

## Problem
Given an array of integers, find the second largest distinct element in the array.

If there is no second largest element, return `-1`.

## Algorithm
1. Sort the array in ascending order.
2. Start from the second-last element.
3. Compare each element with the element after it.
4. If `arr[i] < arr[i + 1]`, then `arr[i]` is the second largest distinct element.
5. Return that element.
6. If no second largest element is found, return `-1`.
## Example

### Input
arr = [12, 35, 1, 10, 34, 1]

### Sorted Array
[1, 1, 10, 12, 34, 35]

### Output
34
## Time Complexity
- **O(n log n)** due to sorting.

## Space Complexity
- **O(1)** auxiliary space, excluding the sorting implementation.
