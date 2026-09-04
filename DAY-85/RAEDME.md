# Reverse a Linked List Between Two Positions

## Problem
Given the head of a singly linked list and two positions `a` and `b`, reverse the nodes from position `a` to position `b`.

The positions are **1-indexed**.

## Algorithm
1. Traverse the list until reaching position `a`.
2. Keep track of the node before position `a` using `prev`.
3. Store the first node of the sublist as `revHead`.
4. Reverse the nodes from position `a` to `b`.
5. Connect the node before the reversed part to the new head of the reversed sublist.
6. Connect the original first node of the sublist to the remaining list.
7. Return the updated head.
## Example

### Input

```text
Linked List: 1 -> 2 -> 3 -> 4 -> 5
a = 2
b = 4
```

### Output

```text
1 -> 4 -> 3 -> 2 -> 5
```

## Time Complexity

- **O(n)**

## Space Complexity

- **O(1)**
