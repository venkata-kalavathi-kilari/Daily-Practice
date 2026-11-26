# Maximum Triangle Perimeter

## Problem

Given an array of positive integers representing side lengths, find the **maximum perimeter of a triangle** that can be formed using any three elements from the array.

If it is not possible to form a triangle, return `-1`.

A triangle is valid if the sum of any two sides is greater than the third side.

## Algorithm

1. Sort the array in ascending order using `Arrays.sort()`.
2. Reverse the array to make it descending order.
3. Traverse the array starting from index `0`.
4. Check whether the three consecutive elements can form a valid triangle:
   - `arr[i] < arr[i + 1] + arr[i + 2]`
5. If the condition is satisfied, return their sum as the perimeter.
6. Since the array is sorted in descending order, the first valid triangle gives the maximum perimeter.
7. If no valid triangle is found, return `-1`.

## Example

### Input
arr = [6, 5, 4, 3, 2]

### Output
15
## Time Complexity

**O(n log n)** 

## Space Complexity

**O(1)** 
