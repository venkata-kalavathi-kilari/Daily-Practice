# Check if Two Strings are Anagrams

## Problem
Given two strings `s1` and `s2`, determine whether they are **anagrams** of each other. Two strings are anagrams if they contain the same characters with the same frequencies, but the characters may appear in a different order.

## Algorithm
1. Check if the lengths of the two strings are equal.
2. If the lengths are different, return `false`.
3. Convert both strings into character arrays.
4. Sort both character arrays.
5. Compare the sorted arrays using `Arrays.equals()`.
6. If both arrays are equal, return `true`; otherwise, return `false`.

## Example 1

### Input
s1 = "listen"
s2 = "silent"

### Output
true

### Explanation
After sorting:
listen → eilnst
silent → eilnst
Both sorted strings are identical, so they are anagrams.

## Time Complexity
- **O(n log n)**, where `n` is the length of the strings (sorting dominates).

## Space Complexity
- **O(n)**
