# Rotate a Doubly Linked List

## Problem
Given the head of a doubly linked list and an integer `k`, rotate the linked list to the left by `k` positions.

## Algorithm
1. If the list is empty or `k = 0`, return the original head.
2. Traverse the list to find its length.
3. Calculate `k % len` to handle cases where `k` is greater than the length.
4. Move to the `kth` node.
5. The node after the `kth` node becomes the new head.
6. Break the connection between the `kth` node and the new head.
7. Traverse to the end of the remaining list.
8. Connect the last node to the old head.
9. Update the `prev` pointers accordingly.
10. Return the new head.

## Example

### Input
```text
Doubly Linked List:

1 <-> 2 <-> 3 <-> 4 <-> 5

k = 2
```

### Output
```text
3 <-> 4 <-> 5 <-> 1 <-> 2
```
## Time Complexity
- **O(n)**


## Space Complexity
- **O(1)**
