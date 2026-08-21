# Delete a Node in a Linked List

## Problem
Given a node `x` in a singly linked list, delete that node from the linked list.

The head of the linked list is not given. Therefore, we copy the data from the next node into the current node and then remove the next node.

## Algorithm
1. Copy the data of the next node into the current node.
2. Change the current node's `next` pointer to skip the next node.
3. The next node is effectively removed from the linked list.
## Example

### Input
Linked List: 10 -> 20 -> 30 -> 40
Node to delete: 20

### Output
10 -> 30 -> 40
## Time Complexity
- **O(1)**

## Space Complexity
- **O(1)**
