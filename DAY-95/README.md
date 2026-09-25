# K Largest Elements

## Problem

Given an array of integers and an integer `k`, find the `k` largest elements from the array.

The elements should be returned in **descending order**.

## Algorithm

1. Sort the array in ascending order using `Arrays.sort()`.
2. Start from the last element, which is the largest.
3. Traverse backwards for `k` elements.
4. Add each element to the result list.
5. Return the result.

## Example

### Input
arr = [12, 5, 8, 20, 3]
k = 3

### After Sorting
[3, 5, 8, 12, 20]

### Output
[20, 12, 8]

## Time Complexity

**O(n log n)** — `Arrays.sort()` takes O(n log n).

## Space Complexity

**O(k)** auxiliary/output space for the result list, excluding the sorting implementation.
