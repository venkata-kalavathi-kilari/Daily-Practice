# Divisibility by 13

## Problem

Given a number `s` represented as a string, determine whether the integer it represents is divisible by `13` or not.

Return:

- `true` if the number is divisible by `13`
- `false` otherwise

## Example

### Input

s = "2911285"


### Output

true
### Explanation

2911285 ÷ 13 = 223945

Since the division leaves no remainder, the number is divisible by `13`.


## Algorithm

1. Initialize a variable `rem = 0` to store the running remainder.
2. Traverse each digit of the string.
3. Update the remainder using:

   ```text
   rem = (rem × 10 + currentDigit) % 13
   ```

4. After processing all digits:
   - If `rem == 0`, return `true`.
   - Otherwise, return `false`.


## Time Complexity

O(n)

## Space Complexity

O(1)
