# Kth Node from the End of a Linked List

## Problem
Given the head of a singly linked list and an integer `k`, find the **kth node from the end** of the linked list.

If `k` is greater than the length of the linked list, return `-1`.

## Algorithm
1. Traverse the linked list and count the total number of nodes.
2. If `k > count`, return `-1`.
3. Start again from the head.
4. Move `count - k` positions forward.
5. The current node is the kth node from the end.
6. Return its data.

## Example 1

### Input
Linked List: 10 -> 20 -> 30 -> 40 -> 50
k = 2

### Output
40

### Explanation
From the end:

1st → 50
2nd → 40

Therefore, the 2nd node from the end is `40`.

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**
