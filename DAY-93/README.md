# Count Number of Ones

## Problem

Given an array containing integers, count how many times the value `1` appears in the array.

## Algorithm

1. Initialize `count = 0`.
2. Traverse every element of the array.
3. If the current element is equal to `1`, increment `count`.
4. Return `count`.

## Example

### Input
arr = [1, 0, 1, 1, 0, 1]

### Output
4

## Time Complexity

**O(n)** — The array is traversed once.

## Space Complexity

**O(1)** — Only the `count` variable is used.
