# Sort Colors Using Selection Sort

## Problem

Given an array containing only `0`, `1`, and `2`, sort the array in ascending order so that:

- `0` represents Red
- `1` represents White
- `2` represents Blue

The sorting must be done **in-place**.

## Algorithm

1. Traverse the array using the outer loop from `i = 0` to `n - 2`.
2. Initialize `minIndex = i`.
3. Traverse the remaining elements using the inner loop.
4. If `arr[j] < arr[minIndex]`, update `minIndex = j`.
5. Swap the element at `i` with the element at `minIndex`.
6. Repeat until the array is sorted.
7. Print the sorted array.
## Example 

### Input
6
2 0 2 1 1 0

### Output
0 0 1 1 2 2

## Time Complexity

**O(n²)** 

## Space Complexity

**O(1)**

# Bubble Sort

## Problem

Given an array of integers, sort the array in ascending order using the Bubble Sort algorithm.

## Algorithm

1. Traverse the array using the outer loop from `i = 0` to `n - 1`.
2. For each element, traverse the remaining elements using the inner loop from `j = i + 1` to `n - 1`.
3. Compare `arr[i]` with `arr[j]`.
4. If `arr[i] > arr[j]`, swap the elements.
5. Repeat until the array is sorted.
6. Print the sorted array.

## Example

### Input
```text
5
5 3 1 4 2
```

### Output
```text
1 2 3 4 5
```

## Time Complexity

**O(n²)** 

## Space Complexity

**O(1)** 
