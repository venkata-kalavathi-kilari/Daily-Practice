# Count Occurrences of a Key in a Linked List

## Problem
Given the head of a singly linked list and an integer `key`, count how many times the `key` occurs in the linked list.

## Algorithm
1. Start from the head node using `temp`.
2. Initialize `count = 0`.
3. Traverse the linked list until `temp` becomes `null`.
4. For each node:
   - If `temp.data == key`, increase `count` by 1.
5. Move `temp` to the next node.
6. Return `count`.

## Example 1

### Input
```text
Linked List: 1 -> 2 -> 2 -> 3 -> 2
Key: 2
```

### Output
```text
3
```

## Time Complexity

```text
O(n)
```

## Space Complexity

```text
O(1)
```
