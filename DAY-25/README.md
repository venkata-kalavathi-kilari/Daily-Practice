# Floor Square Root (Integer Square Root)

## Problem
Given a non-negative integer `n`, find the **floor value of its square root**.  
The floor value means the greatest integer `x` such that `x * x ≤ n`.

## Example

### Input
n = 10

### Output
3

## Algorithm
1. Take input integer `n`
2. Compute square root using `Math.sqrt(n)`
3. Convert result to integer using type casting `(int)`
4. Return the integer value


## Time Complexity
- **O(1)**  
Because `Math.sqrt()` is a constant-time built-in function

## Space Complexity
- **O(1)**  
No extra space is used
