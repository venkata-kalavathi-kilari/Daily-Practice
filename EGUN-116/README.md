# Check if Array Is Sorted

## Problem
Given an array, check whether it is sorted in non-decreasing (ascending) order.

## Example

**Input:**
arr = {1, 2, 3, 4, 5}

**Output:**
true

**Explanation:**

All elements are in ascending order.

**Input:**
arr = {1, 3, 2, 4, 5}

**Output:**
false


## Algorithm
1. Find the length of the array.
2. Traverse the array from index 0 to n-2.
3. Compare the current element with the next element.
4. If `arr[i] > arr[i+1]`, return false.
5. If all elements are in order, return true.

## Time Complexity
O(n) - We traverse the array once.

## Space Complexity
O(1) - No extra space is used.
