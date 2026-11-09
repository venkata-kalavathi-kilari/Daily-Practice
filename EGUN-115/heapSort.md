# Heap Sort

## Problem
Implement Heap Sort to sort the given array in ascending order using a Binary Heap.

## Example

**Input:**
```text
[9, 4, 3, 8, 10, 2, 5]
```

**Binary Tree Representation:**

```text
          9
        /   \
       4     3
      / \   / \
     8  10 2   5
```

**Build Max Heap:**

```text
          10
        /    \
       9      5
      / \    / \
     8   4  2   3
```

**Sorted Output:**
```text
[2, 3, 4, 5, 8, 9, 10]
```

## Algorithm
1. Convert the given array into a Max Heap.
2. Swap the root (largest element) with the last element.
3. Reduce the heap size by one.
4. Apply heapify to maintain the Max Heap property.
5. Repeat until the array is sorted.

## Time Complexity
- Best Case: O(n log n)
- Average Case: O(n log n)
- Worst Case: O(n log n)

## Space Complexity
- O(log n) – Due to recursive heapify calls.

## Approach
Heap Sort uses a Max Heap to repeatedly extract the largest element and place it at the end of the array until the array is sorted.
