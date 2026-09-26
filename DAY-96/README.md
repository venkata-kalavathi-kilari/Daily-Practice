# Kth Smallest Element in a Matrix

## Problem

Given an `n x n` matrix and an integer `k`, find the **kth smallest element** in the matrix.

## Algorithm

1. Create an `ArrayList` to store all matrix elements.
2. Traverse every row and column of the matrix.
3. Add each element to the `ArrayList`.
4. Sort the `ArrayList` in ascending order using `Collections.sort()`.
5. The kth smallest element is at index `k - 1`.
6. Return `arr.get(k - 1)`.

### After Storing All Elements
```text
[10, 20, 30, 15, 25, 35, 24, 29, 37]
```

### After Sorting
```text
[10, 15, 20, 24, 25, 29, 30, 35, 37]
```

### Output
```text
25
```

## Time Complexity

**O(n² log n)**

## Space Complexity

**O(n²)** — The `ArrayList` stores all `n²` matrix elements.
