# Smallest Number Whose Digit Product is Divisible by `t`

## Problem
Given two integers `n` and `t`, find the smallest integer greater than or equal to `n` such that the product of its digits is divisible by `t`.

## Algorithm
1. Start from the given number `n`.
2. Calculate the product of all digits of the current number.
3. Check whether the product is divisible by `t`.
4. If it is divisible, return the current number.
5. Otherwise, increment `n` and repeat the process until a valid number is found.
## Example 1

### Input
n = 10
t = 2

### Output
10

### Explanation
The product of digits of `10` is:

1 × 0 = 0

Since `0` is divisible by `2`, the answer is `10`.

## Time Complexity
- **O(k × d)**

Where:
- `k` = number of integers checked until the answer is found.
- `d` = number of digits in each integer.

## Space Complexity
- **O(1)**
