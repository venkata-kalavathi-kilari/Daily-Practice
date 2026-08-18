# Detect Loop in a Linked List

## Problem
Given the head of a singly linked list, determine whether the linked list contains a loop (cycle).

Return:
- `true` if a loop exists.
- `false` if there is no loop.

## Algorithm
This solution uses **Floyd's Cycle Detection Algorithm**, also called the **Slow and Fast Pointer technique**.

1. Initialize two pointers:
   - `slow = head`
   - `fast = head`
2. Move `slow` one node at a time.
3. Move `fast` two nodes at a time.
4. If `slow == fast`, a loop exists.
5. If `fast` reaches `null`, there is no loop.
6. Return the result

## Example 1

### Input
```text |____|
```
1 -> 2 -> 3 -> 4
          ↑    |
         

### Output
true

## Time Complexity

O(n)
## Space Complexity

O(1)

**This is Floyd's Cycle Detection Algorithm.**
