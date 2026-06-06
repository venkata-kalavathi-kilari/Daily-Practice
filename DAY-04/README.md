# 3300. Minimum Element After Replacement With Digit Sum

## Problem
You are given an integer array nums.

Replace every element with the sum of its digits 
and return the minimum element after replacement.


## Example

Input:
nums = [10,12,13,14]

After Replacement:
[1,3,4,5]

Output:
1


## Algorithm
1. Traverse each element in the array.
2. Find the sum of digits of the current number.
3. Store the minimum digit sum.
4. Return the minimum value.


## Step-by-Step Explanation

nums = [999,19,199]

999 → 9 + 9 + 9 = 27
19  → 1 + 9 = 10
199 → 1 + 9 + 9 = 19

Minimum Element = 10



## Time Complexity

O(n * d)

n = number of elements
d = number of digits

## Space Complexity

O(1)
