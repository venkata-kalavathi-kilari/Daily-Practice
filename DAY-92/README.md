# Find Repeating and Missing Element

## Problem

Given an array of size `n` containing numbers from `1` to `n`, one number is repeated twice and one number is missing.

Find:
- The **repeating** number
- The **missing** number

Return them in the order:

`[repeating, missing]`

## Algorithm

1. Create a frequency array `freq` of size `n + 1`.
2. Traverse the given array and count the frequency of each element.
3. Traverse the frequency array from `0` to `n`.
4. If `freq[i] == 0`, then `i` is the **missing** number.
5. If `freq[i] == 2`, then `i` is the **repeating** number.
6. Store both values in an `ArrayList`.
7. Return the result.

## Example

### Input
arr = [1, 3, 3, 4, 5]

### Output
[3, 2]

## Time Complexity

**O(n)** — We traverse the array and frequency array once.

## Space Complexity

**O(n)** — The `freq` array requires `n + 1` space.
