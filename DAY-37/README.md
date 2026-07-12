# Count Number of Digits

## Problem
Given an integer `n`, count the total number of digits present in the number and return the count.

## Algorithm
1. If `n` is `0`, return `1` because `0` has one digit.
2. Initialize a variable `count` to `0`.
3. Repeat until `n` becomes `0`:
   - Divide `n` by `10`.
   - Increment `count` by `1`.
4. Return `count`.

## Example 1

### Input
n = 12345

### Output
5
### Explanation
The number `12345` contains 5 digits.
## Time Complexity
- **O(log₁₀ n)**

## Space Complexity
- **O(1)**
