# Second Largest Element in an Array

## Problem 

Given an array of integers, find the second largest element in the array without sorting it.

## Algorithm

1. Initialize two variables:
   - first to store the largest element.
   - second to store the second largest element.
2. Traverse the array.
3. If the current element is greater than first:
   - Assign first to second.
   - Update first.
4. Else if the current element is greater than second and not equal to first:
   - Update second.
5. Return second.

## Example

Input:

arr = [12, 35, 1, 10, 34, 1]

Processing:

* 12 → first = 12, second = MIN
* 35 → first = 35, second = 12
* 1 → No change
* 10 → No change
* 34 → second = 34
* 1 → No change

Final Values:

first = 35

second = 34

Output:

34

## Time Complexity

* O(n) — Single traversal of the array.

## Space Complexity

* O(1) — Only two extra variables are used.
