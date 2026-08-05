# Find the Middle Element of a Linked List

## Problem
Given the head of a singly linked list, find and return the data of the middle node.

If the linked list contains an even number of nodes, return the **second middle node**.

## Algorithm
1. Traverse the linked list to calculate its length.
2. Compute the middle index as `length / 2`.
3. Traverse the linked list again until the middle index is reached.
4. Return the data of the middle node.

## Example 1

### Input
```text
Linked List: 1 -> 2 -> 3 -> 4 -> 5
```

### Output
3

### Explanation
The linked list has 5 nodes. The middle node is the 3rd node, whose value is `3`.
## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**
