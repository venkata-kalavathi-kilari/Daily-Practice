# Floor and Ceil of Division

## Problem
Given two integers `a` and `b` (`b ≠ 0`), find:

- **Floor(a / b)**: The greatest integer less than or equal to `a / b`.
- **Ceil(a / b)**: The smallest integer greater than or equal to `a / b`.

Return both values as an ArrayList in the format:
[floor, ceil]

## Example

### Input

a = 5, b = 3


### Output

[1, 2]

### Explanation

5 / 3 = 1.66...
Floor = 1
Ceil = 2

## Algorithm
1. Convert `a` and `b` to `double` and compute `a / b`.
2. Use `Math.floor()` to find the floor value.
3. Use `Math.ceil()` to find the ceil value.
4. Store both values in an ArrayList.
5. Return the ArrayList.

## Time Complexity

O(1)


## Space Complexity

O(1)
