# Check if a String is a Pangram

## Problem
Given a string `s`, determine whether it is a **pangram**. A pangram is a sentence that contains every letter of the English alphabet (`a` to `z`) at least once. Return `true` if the string is a pangram; otherwise, return `false`.

## Algorithm
1. Iterate through each character from `'a'` to `'z'`.
2. For every letter, search the entire string.
3. Convert each character of the string to lowercase using `Character.toLowerCase()`.
4. If the current alphabet letter is found, continue checking the next letter.
5. If any letter is not found, return `false`.
6. If all 26 letters are found, return `true`.

## Example 1

### Input

s = "The quick brown fox jumps over the lazy dog"

### Output
true

### Explanation
The sentence contains every letter from `a` to `z` at least once.


## Time Complexity
- O(26 × n) ≈ O(n), where `n` is the length of the string.

## Space Complexity
- O(1)
