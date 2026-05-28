# Two Sum

## Question
Given an array of numbers and a target value, find the positions of two numbers whose sum equals the target.

## Algorithm
1. Take the first number.
2. Compare it with remaining numbers.
3. Add both numbers.
4. If sum equals target:
   - Store positions.
5. Return the positions.

## Example

Input:
nums = [2,7,11,15]
target = 9

Step 1:
2 + 7 = 9

Target matched.

Step 2:
Positions are:
0 and 1

## Output
[0,1]

## Time Complexity
O(n²)

Reason:
Each number is checked with other numbers.

## Space Complexity
O(1)

Reason:
Only small extra memory is used.
