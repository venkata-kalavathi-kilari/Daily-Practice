# Print a Circular Linked List

## Problem
Given the head of a circular linked list, print all the elements of the list.

In a circular linked list, the last node points back to the first node instead of `null`.

## Algorithm
1. Check if `head` is `null`.
2. If `head` is `null`, return because the list is empty.
3. Set `curr = head`.
4. Use a `do-while` loop to visit each node.
5. Print the data of the current node.
6. Move `curr` to the next node.
7. Stop when `curr` becomes equal to `head`.

## Example

### Input
```text
1 -> 2 -> 3 -> 4
^              |
|______________|
```

### Output
```text
1 2 3 4
```

## Time Complexity
- **O(n)** — Each node is visited exactly once.

## Space Complexity
- **O(1)** — Only one pointer `curr` is used.
