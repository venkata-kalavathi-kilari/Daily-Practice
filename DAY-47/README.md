# Maximum Product of Two Decremented Numbers

## Problem
Given an integer array `nums`, choose the two largest numbers, subtract `1` from each, and return their product.

## Algorithm
1. Sort the array in ascending order.
2. The largest element is at index `n - 1`.
3. The second-largest element is at index `n - 2`.
4. Subtract `1` from both numbers.
5. Multiply them and return the result.
## Example

### Input
nums = [3, 4, 5, 2]

### Output
12

### Explanation
The two largest numbers are 5 and 4.
After subtracting 1 from both:
(5 - 1) = 4
(4 - 1) = 3
Product:
4 × 3 = 12
## Time Complexity
- **O(n log n)** due to sorting.

## Space Complexity
- **O(1)** auxiliary space, excluding the sorting implementation.
