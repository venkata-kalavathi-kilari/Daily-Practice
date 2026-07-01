# Hollow Rectangle Pattern

## Problem
Given two integers `n` and `m`, print a hollow rectangle pattern of `n` rows and `m` columns using `*`.

The boundary of the rectangle is printed with `*`, and the inner part is filled with spaces.

## Algorithm
1. Read the values of `n` (rows) and `m` (columns).
2. Traverse rows from `1` to `n`.
3. For each row, traverse columns from `1` to `m`.
4. If the current position is on the boundary:
   - `i == 1` (first row)
   - `i == n` (last row)
   - `j == 1` (first column)
   - `j == m` (last column)
   
   Print `*`.
5. Otherwise, print a space `" "`.
6. Move to the next line after each row.


## Example

### Input
5 6

### Output
```text
******
*    *
*    *
*    *
******
```
## Time Complexity
- **O(n × m)**

## Space Complexity
- **O(1)**
