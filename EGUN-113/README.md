# Binary Search

## Problem

Given a sorted array of integers and a target value, find the index of the target using **Binary Search**.

- If the target is found, return its index.
- If the target is not found, return `-1`.

## Algorithm

1. Read the array and the target value.
2. Initialize `low = 0` and `high = n - 1`.
3. Repeat while `low <= high`:
   - Calculate `mid = (low + high) / 2`.
   - If `arr[mid] == target`, store the index and stop searching.
   - If `arr[mid] < target`, search the right half by setting `low = mid + 1`.
   - Otherwise, search the left half by setting `high = mid - 1`.
4. Print the result.
## Example
### Input
5
1 3 5 7 9
7
### Output
3
## Time Complexity
**O(log n)** 
## Space Complexity
**O(1)**
