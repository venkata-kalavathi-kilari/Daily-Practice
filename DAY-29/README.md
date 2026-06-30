# Floyd's Triangle Pattern

## Problem
Given an integer `n`, print Floyd's Triangle containing `n` rows.

In Floyd's Triangle, numbers are printed consecutively starting from `1`, and each row contains as many numbers as its row number.

## Algorithm
1. Read the value of `n`.
2. Initialize `value = 1`.
3. Traverse rows from `1` to `n`.
4. For each row `i`, print `i` numbers.
5. After printing each number, increment `value`.
6. Move to the next line after each row.

## Example

### Input
5

### Output
```text
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```


## Time Complexity
- **O(n²)**

## Space Complexity
- **O(1)**
