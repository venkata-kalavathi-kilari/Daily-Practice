# Check Whether a Number Can Be Expressed as Sum of Consecutive Numbers

## Problem 
Given a positive integer n, determine whether it can be represented as the sum of two or more consecutive positive integers.

Examples:
n = 15
15 = 1 + 2 + 3 + 4 + 5
Output: Yes

n = 8
8 cannot be expressed as the sum of consecutive positive integers.
Output: No

## Algorithm
1. If n == 1, return false.
2. Check if n is a power of 2 using:
   (n & (n - 1)) == 0
3. If n is a power of 2, return false.
4. Otherwise, return true.


## Time Complexity
O(1)

## Space Complexity
O(1)
