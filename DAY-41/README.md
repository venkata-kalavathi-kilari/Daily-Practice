# Find Mean of an Array

## Problem
Given an integer array `arr[]`, find and return the **mean (average)** of all its elements. The mean is calculated as the sum of all elements divided by the total number of elements.

## Algorithm
1. Find the length of the array `n`.
2. Initialize a variable `sum` to `0`.
3. Traverse the array and add each element to `sum`.
4. Divide `sum` by `n` using integer division.
5. Return the result.

## Example 1

### Input
arr = [1, 2, 3, 4, 5]

### Output
3

### Explanation
Sum of elements = `1 + 2 + 3 + 4 + 5 = 15`  
Mean = `15 / 5 = 3`


## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**
