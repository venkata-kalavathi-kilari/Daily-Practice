# Count Nodes in a Linked List

## Problem
Given the head of a singly linked list, count the total number of nodes present in the linked list and return the count.

## Algorithm
1. Initialize a variable `count` to `0`.
2. Create a temporary pointer `temp` and assign it to the head of the linked list.
3. Traverse the linked list until `temp` becomes `null`.
4. For each node visited:
   - Increment `count`.
   - Move `temp` to the next node.
5. Return `count`.

## Example 1

### Input
Linked List: 1 -> 2 -> 3 -> 4 -> 5

### Output
5

### Explanation
The linked list contains 5 nodes, so the function returns `5`.

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**
