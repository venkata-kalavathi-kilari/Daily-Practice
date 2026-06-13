# Leaders in an Array

## Problem
Given an array `arr[]`, find all the leaders in the array.

An element is called a leader if it is greater than or equal to all the elements to its right. The rightmost element is always a leader.

## Example

### Input
arr = [16, 17, 4, 3, 5, 2]


### Output
[17, 5, 2]

## Algorithm
1. Initialize `maxRight` with the last element of the array.
2. Add `maxRight` to the answer list.
3. Traverse the array from right to left.
4. If `arr[i] >= maxRight`:
   - Update `maxRight`.
   - Add the element to the answer list.
5. Reverse the answer list.
6. Return the answer list.

## Time Complexity
O(n)

## Space Complexity
O(1)
