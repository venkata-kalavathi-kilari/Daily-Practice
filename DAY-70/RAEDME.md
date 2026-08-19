# Reverse Linked List in Groups of K

## Problem
Given a singly linked list and an integer `k`, reverse the linked list in groups of `k` nodes.

## Algorithm
1. Start from the head of the linked list.
2. Check the first `k` nodes.
3. Reverse those `k` nodes using `reverseKNodes()`.
4. Recursively reverse the remaining groups of `k` nodes.
5. Connect the reversed group with the next reversed group.
6. Return the new head of the reversed list.

## Example

### Input
```text
Linked List: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8
k = 3
```

### Output
```text
3 -> 2 -> 1 -> 6 -> 5 -> 4 -> 7 -> 8
```
## Time Complexity
- **O(n)**

## Space Complexity
- **O(n)** due to recursion.
