# Delete All Occurrences of a Given Value in a Linked List

## Problem
Given the head of a singly linked list and an integer `x`, delete all nodes whose data is equal to `x` and return the updated head.

## Algorithm
1. Initialize two pointers:
   - `curr` to traverse the linked list.
   - `prev` to keep track of the previous node.
2. Traverse the linked list until `curr` becomes `null`.
3. If `curr.data == x`:
   - If `prev == null`, the node is the head, so update `head = curr.next`.
   - Otherwise, skip the current node using `prev.next = curr.next`.
   - Move `curr` to the next node.
4. If `curr.data != x`:
   - Move `prev` to `curr`.
   - Move `curr` to the next node.
5. Return the updated `head`.

## Example

### Input
Linked List: 1 -> 2 -> 3 -> 2 -> 4 -> 2
x = 2

### Output
1 -> 3 -> 4
## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**
