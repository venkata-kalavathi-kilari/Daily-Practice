# Delete Middle Node of a Linked List

## Problem
Given the head of a singly linked list, delete the **middle node** of the linked list and return the head of the modified list.

For an even number of nodes, the **second middle node** is deleted.

## Algorithm
1. If the list has only one node, return `null`.
2. Traverse the linked list and find its length.
3. Calculate the middle position using `len / 2`.
4. Traverse the list until the node just before the middle node.
5. Delete the middle node by changing the `next` pointer.
6. Return the head of the modified list.
## Example 1

### Input
```text
Linked List: 1 -> 2 -> 3 -> 4 -> 5
```

### Output
```text
1 -> 2 -> 4 -> 5
```

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**
