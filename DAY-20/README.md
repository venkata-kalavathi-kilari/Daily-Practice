# Remove All Occurrences of a Character from a String

## Problem

Given a string `s` and a character `c`, remove all occurrences of `c` from the string.

## Example

### Input

s = "geeksforgeeks"
c = 'e'


### Output

"gksforgks"


### Explanation

All occurrences of `'e'` are removed from the string:
geeksforgeeks → gksforgks


## Algorithm

1. Traverse the string using an index `i`.
2. Check if the character at index `i` is equal to `c`.
3. If it matches:
   - Remove the character using `deleteCharAt(i)`.
   - Decrement `i` by 1 to recheck the current position after deletion.
4. Continue until the end of the string.
5. The modified string contains no occurrences of `c`.


## Time Complexity

O(n²)


## Space Complexity

O(1)
