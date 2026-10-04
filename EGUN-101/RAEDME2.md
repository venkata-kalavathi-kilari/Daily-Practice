# First and Last Occurrence of an Element

## Problem

Given a sorted array and a target element `x`, find the **first occurrence** and **last occurrence** of `x`.

If `x` is not present in the array, return `[-1, -1]`.

## Algorithm

### First Occurrence

1. Perform binary search.
2. If `arr[mid] == target`:
   - Store `mid` as the first occurrence.
   - Continue searching on the left side.
3. If `arr[mid] < target`, search the right side.
4. Otherwise, search the left side.

### Last Occurrence

1. Perform binary search.
2. If `arr[mid] == target`:
   - Store `mid` as the last occurrence.
   - Continue searching on the right side.
3. If `arr[mid] < target`, search the right side.
4. Otherwise, search the left side.

### Final Step

Add the first and last occurrence to an `ArrayList` and return it.

## Example

### Input
arr = [1, 2, 2, 2, 3, 4]
x = 2

### Output
[1, 3]


## Time Complexity

**O(log n)** 

## Space Complexity

**O(1)**
