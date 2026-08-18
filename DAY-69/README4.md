# Length of Loop in a Linked List

## Problem
Given the head of a linked list, find the length of the loop if a loop exists. If there is no loop, return `0`.

## Algorithm
1. Use **Floyd's Cycle Detection Algorithm** with two pointers:
   - `slow` moves one step at a time.
   - `fast` moves two steps at a time.
2. If `slow` and `fast` meet, a loop exists.
3. Start from the meeting point.
4. Move around the loop until reaching the same node again.
5. Count the nodes visited. This gives the length of the loop.
6. If `slow` and `fast` never meet, return `0`.


## Example

### Input
```text
1 -> 2 -> 3 -> 4 -> 5
          ↑         |
          |_________|
```

### Output
```text
3
```
## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**
