# Reverse a Doubly Linked List

## Problem
Given the head of a doubly linked list, reverse the list and return the new head.

A doubly linked list has two links for each node:
- `next` → points to the next node.
- `prev` → points to the previous node.

## Algorithm
1. If the list is empty or contains only one node, return `head`.
2. Start from the head using `curNode`.
3. For every node:
   - Store the current `prev` node.
   - Swap the `prev` and `next` pointers.
   - Move `curNode` to the next node in the reversed direction.
4. After the loop, update `head` to the new first node.
5. Return the new `head`.

## Example

### Input
10 <-> 20 <-> 30 <-> 40

### Output
40 <-> 30 <-> 20 <-> 10

### Explanation
For every node, we swap its `next` and `prev` pointers.

Before:
10 <-> 20 <-> 30 <-> 40

After reversing:
40 <-> 30 <-> 20 <-> 10

The node `40` becomes the new head.

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**
