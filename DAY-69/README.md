# Pairwise Swap Elements in a Linked List

## Problem
Given a singly linked list, swap every two adjacent elements.

If the number of nodes is odd, the last node remains unchanged.

## Algorithm
1. Check if the linked list is empty.
2. Start from the first node using `curr`.
3. Check whether `curr` and `curr.next` exist.
4. Swap the data values of the two nodes.
5. Move `curr` two positions forward.
6. Repeat until all pairs are processed.
7. Return the original head.
## Example 1

### Input
```text
1 -> 2 -> 3 -> 4 -> 5
```

### Output
```text
2 -> 1 -> 4 -> 3 -> 5
```

### Explanation
The elements are divided into pairs:

```text
(1, 2) -> (3, 4) -> (5)
```

After swapping:

```text
(2, 1) -> (4, 3) -> (5)
```

So the final linked list is:

```text
2 -> 1 -> 4 -> 3 -> 5
```
## Time Complexity

```
```text
O(n)
```

Each node is visited once.

## Space Complexity

```text
O(1)
