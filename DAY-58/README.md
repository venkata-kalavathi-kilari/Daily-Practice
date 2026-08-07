# Reverse a Singly Linked List

## Problem
Given the head of a singly linked list, reverse the linked list and return the new head.

## Algorithm
1. Initialize three pointers:
   - `prev = null`
   - `cur = head`
   - `next`
2. Traverse the linked list until `cur` becomes `null`.
3. Store the next node in `next`.
4. Reverse the current node's link by pointing it to `prev`.
5. Move `prev` to the current node.
6. Move `cur` to `next`.
7. After the traversal, `prev` points to the new head of the reversed linked list.
8. Return `prev`.

## Example

### Input
Linked List: 1 -> 2 -> 3 -> 4 -> 5

### Output
Linked List: 5 -> 4 -> 3 -> 2 -> 1

### Explanation
Initially:
1 -> 2 -> 3 -> 4 -> 5 -> NULL

After reversing the links:

5 -> 4 -> 3 -> 2 -> 1 -> NULL

The new head of the linked list is `5`.

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**
