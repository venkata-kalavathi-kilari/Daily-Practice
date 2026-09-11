# Delete N Nodes After M Nodes of a Linked List
## Problem
Given a linked list, delete `N` nodes after every `M` nodes until the end of the list.

## Algorithm
1. Start from the head of the linked list.
2. Traverse and keep the first `M` nodes.
3. Store the next node after the `M` nodes.
4. Skip the next `N` nodes.
5. Connect the last kept node to the remaining list.
6. Repeat the process until the end of the linked list.

## Example

### Input

```text
Linked List:
1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10

M = 2
N = 3
```

### Output

```text
1 -> 2 -> 6 -> 7
```

## Time Complexity

- **O(L)**

## Space Complexity

- **O(1)**
