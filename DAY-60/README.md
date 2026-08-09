# Rotate a Linked List

## Problem
Given the head of a singly linked list and an integer `k`, rotate the linked list to the left by `k` positions.

## Algorithm
1. If the list is empty or `k = 0`, return `head`.
2. Traverse the list to find its length.
3. Calculate `k % length` to handle cases where `k` is larger than the list length.
4. Connect the last node to the head to make the list circular.
5. Move `k - 1` steps to find the new last node.
6. The next node becomes the new head.
7. Break the circular connection.
8. Return the new head.

## Example

### Input
```text
Linked List: 1 -> 2 -> 3 -> 4 -> 5
k = 2
```

### Output
```text
3 -> 4 -> 5 -> 1 -> 2
```

### Explanation
The list is rotated by `2` positions:

```text
1 -> 2 -> 3 -> 4 -> 5
```

After rotation:

```text
3 -> 4 -> 5 -> 1 -> 2
```

The new head is `3`.

## Why `k %= length`?

If the list has 5 nodes and `k = 7`:

```text
7 % 5 = 2
```

Rotating 7 times is the same as rotating 2 times.

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**
