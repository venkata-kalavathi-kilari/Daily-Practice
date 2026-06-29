# Number of Strings That Appear as Substrings in Word

## Problem
Given an array of strings `patterns` and a string `word`, return the number of strings in `patterns` that exist as a substring in `word`.

A substring is a contiguous sequence of characters within a string.

## Algorithm
1. Initialize `count = 0`.
2. Traverse each string `s` in `patterns`.
3. Check if `word.contains(s)`.
4. If it is present, increment `count`.
5. Return `count`.

## Example

### Input
patterns = ["a", "abc", "bc", "d"]
word = "abc"

### Output
3

## Time Complexity
- **O(n × m)**

Where:
- `n` = number of strings in `patterns`
- `m` = length of `word`

## Space Complexity
- **O(1)**
