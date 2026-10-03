# Upper Bound

## Problem

Given a sorted array and a target value, find the index of the **first element that is greater than the target**.

If no element is greater than the target, return the length of the array.

## Algorithm

1. Traverse the array from left to right.
2. For each element, check if it is greater than `target`.
3. If `arr[i] > target`, return index `i`.
4. If no element is greater than the target, return `n`.

## Example

### Input
arr = [1, 2, 4, 4, 6, 8]
target = 4

### Output
4

## Time Complexity

**O(n)**

## Space Complexity

**O(1)** 



# Upper Bound using Binary Search

## Problem

Given a sorted array and a target value, find the index of the **first element that is greater than the target**.

If no element is greater than the target, return the length of the array.

## Algorithm

1. Initialize `low = 0` and `high = n - 1`.
2. Set `ans = n`.
3. Apply binary search while `low <= high`.
4. Calculate `mid`.
5. If `arr[mid] > target`:
   - Store `mid` as the answer.
   - Search the left half for an earlier valid index.
6. Otherwise:
   - Search the right half.
7. Return `ans`.


## Example

### Input
arr = [1, 2, 4, 4, 6, 8]
target = 4


### Output
4

## Time Complexity

**O(log n)** 

## Space Complexity

**O(1)**

