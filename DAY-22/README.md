# Rectangular Star Pattern

## Problem

Given two integers `n` and `m`, print a rectangular pattern of stars (`*`) with `n` rows and `m` columns.

### Example

**Input:**
4 5

**Output:**
```
* * * * *
* * * * *
* * * * *
* * * * *
```
## Algorithm

1. Read two integers `n` and `m`.
2. Use an outer loop to iterate through each row from `1` to `n`.
3. For every row, use an inner loop to print `m` stars.
4. After printing one row, move to the next line.
5. Repeat until all `n` rows are printed.

## Time Complexity
O(n × m)

## Space Complexity

O(1)
