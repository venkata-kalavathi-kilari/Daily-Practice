# First Non-Repeating Character

## Problem
Given a string `s`, find the first character that does not repeat in the string. If every character repeats, return `'$'`.


## Algorithm
1. Find the length of the string `n`.
2. Traverse the string from index `0` to `n - 1`.
3. For each character, assume it is non-repeating (`found = false`).
4. Compare it with every other character in the string.
5. If the same character is found at another index, set `found = true` and stop checking.
6. If `found` is still `false`, return the current character.
7. If no non-repeating character exists, return `'$'`.


## Example 1

### Input
s = "geeksforgeeks"

### Output
'f'

### Explanation
The character `'f'` appears only once and is the first non-repeating character.

## Time Complexity
- **O(n²)**

## Space Complexity
- **O(1)**
