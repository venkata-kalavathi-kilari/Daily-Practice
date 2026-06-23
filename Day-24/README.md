# Valid Anagram

## Problem

Given two strings `s` and `t`, determine whether `t` is an anagram of `s`.

An **anagram** is a word or phrase formed by rearranging the letters of another word, using all the original letters exactly once.

### Example 1

**Input:**
s = "anagram"
t = "nagaram"

**Output:**
true
## Algorithm

1. Check if the lengths of `s` and `t` are equal.
   - If not, return `false`.
2. Create a frequency array of size `26` for lowercase English letters.
3. Traverse both strings simultaneously:
   - Increment the count for characters in `s`.
   - Decrement the count for characters in `t`.
4. After traversal, check the frequency array.
   - If any value is not `0`, return `false`.
5. If all values are `0`, return `true`.

## Time Complexity
O(n)


## Space Complexity
O(1)
