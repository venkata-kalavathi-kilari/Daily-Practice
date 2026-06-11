# Toggle Case

## Problem
Given a string `s`, convert:
- Uppercase letters to lowercase letters
- Lowercase letters to uppercase letters
## Example

### Input

AbCdEf

### Output
aBcDeF

## Algorithm
1. Create an empty string `result`.
2. Traverse each character of the string.
3. If the character is uppercase, convert it to lowercase.
4. Otherwise, convert it to uppercase.
5. Append the converted character to `result`.
6. Return `result`.

## Time Complexity
O(n)

## Space Complexity
O(n)
