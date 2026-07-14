# Roman to Integer

## Problem
Given a Roman numeral string `s`, convert it into its corresponding integer value.

Roman numerals use the following symbols:

| Symbol | Value |
|--------|------:|
| I | 1 |
| V | 5 |
| X | 10 |
| L | 50 |
| C | 100 |
| D | 500 |
| M | 1000 |

## Algorithm
1. Initialize `total = 0` and `prev = 0`.
2. Traverse the Roman numeral string from right to left.
3. Convert the current Roman character to its integer value.
4. If the current value is less than the previous value, subtract it from `total`.
5. Otherwise, add it to `total`.
6. Update `prev` with the current value.
7. Return `total`.


## Example 1

### Input
s = "III"

### Output
3

### Explanation
`I + I + I = 1 + 1 + 1 = 3`.


## Time Complexity
- **O(n)**, where `n` is the length of the Roman numeral string.

## Space Complexity
- **O(1)**
