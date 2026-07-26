# Maximum Product of Three Numbers

## Problem
Given an integer array `nums`, find three numbers whose product is maximum and return the maximum product.

## Algorithm
1. Sort the array in ascending order.
2. Calculate the product of the three largest numbers.
3. Calculate the product of the two smallest numbers and the largest number.
4. Return the maximum of these two products.


## Example 1

### Input
nums = [1, 2, 3]

### Output
6
### Explanation
The three largest numbers are `1, 2, 3`.

1 × 2 × 3 = 6
## Why Two Cases?
After sorting, the maximum product can come from:
### Case 1: Three largest numbers
nums[n - 1] × nums[n - 2] × nums[n - 3]
### Case 2: Two smallest negative numbers and the largest number
nums[0] × nums[1] × nums[n - 1]
Two negative numbers multiply to produce a positive number, so this second case must also be checked.

## Time Complexity
- **O(n log n)** due to sorting.

## Space Complexity
- **O(1)** auxiliary space, excluding the sorting implementation.
