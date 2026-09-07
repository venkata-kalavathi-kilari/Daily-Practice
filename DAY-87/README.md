# Remove a Loop from a Linked List

## Problem
Given the head of a linked list that may contain a loop, remove the loop if it exists.

A loop occurs when a node points back to a previously visited node instead of pointing to `null`.

## Algorithm
1. Create a `HashSet` to store visited nodes.
2. Traverse the linked list using the `head` pointer.
3. For each node:
   - If the node is not present in the `HashSet`, add it and move forward.
   - Keep track of the previous node using `prev`.
4. If a node is already present in the `HashSet`, a loop is detected.
5. Set `prev.next = null` to break the loop.
6. Stop the traversal.
## Example

### Input

```text
1 -> 2 -> 3 -> 4 -> 5
          ^         |
          |_________|
```

Here, node `5` points back to node `3`, creating a loop.

### Output

```text
1 -> 2 -> 3 -> 4 -> 5 -> null
```

## Time Complexity

- **O(n)**

## Space Complexity

- **O(n)**
