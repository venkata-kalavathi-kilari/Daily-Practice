# Maximum Gap Between Same Characters

## Problem
Given a string `s`, find the maximum number of characters present between two identical characters. If no character repeats, return `-1`.

## Algorithm
1. Find the length of the string `n`.
2. Initialize `count = -1`.
3. Traverse the string from left to right using index `i`.
4. For each character, traverse from the end of the string using index `j`.
5. If `s.charAt(i) == s.charAt(j)`:
   - Calculate the gap as `j - i - 1`.
   - Update `count` with the maximum value.
   - Stop checking for the current `i`.
6. Return `count`.

## Example 1

### Input
s = "abca"


### Output
2

## Time Complexity
- **O(n²)**

## Space Complexity
- **O(1)**
