# Common Elements in Three Sorted Arrays

## Problem

Given three **sorted arrays**, find the elements that are common in all three arrays.

Each common element should be added only **once**, even if it appears multiple times in the arrays.

## Algorithm

1. Initialize three pointers:
   - `i` for array `a`
   - `j` for array `b`
   - `k` for array `c`
2. Compare `a[i]`, `b[j]`, and `c[k]`.
3. If all three are equal:
   - Add the element to the result.
   - Move all three pointers forward.
   - Skip duplicate elements in all three arrays.
4. If `a[i]` is smaller than `b[j]`, move `i`.
5. Otherwise, if `b[j]` is smaller than `c[k]`, move `j`.
6. Otherwise, move `k`.
7. Continue until any one array is completely traversed.
## Example

### Input

```text
a = [1, 5, 10, 20, 40, 80]
b = [6, 7, 20, 80, 100]
c = [3, 4, 15, 20, 30, 70, 80, 120]
```

### Output

```text
[20, 80]
```


## Time Complexity

**O(n1 + n2 + n3)**

## Space Complexity

**O(1)** auxiliary space, excluding the result list.
