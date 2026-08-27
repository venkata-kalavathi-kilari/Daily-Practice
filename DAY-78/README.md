# Find Pairs with Given Sum in a Doubly Linked List

## Problem
Given a sorted doubly linked list and an integer `target`, find all pairs of nodes whose values add up to the given target.

## Algorithm
1. Set `ptr1` to the head of the linked list.
2. Traverse the list to find the last node and set `ptr2` to it.
3. Use two pointers:
   - `ptr1` moves forward using `next`.
   - `ptr2` moves backward using `prev`.
4. Continue until the two pointers meet or cross.
5. If `ptr1.data + ptr2.data == target`:
   - Store the pair.
   - Move both pointers inward.
6. If the sum is greater than the target, move `ptr2` backward.
7. If the sum is smaller than the target, move `ptr1` forward.
8. Return the list of all valid pairs.

## Example

### Input
```text
Doubly Linked List:
1 <-> 2 <-> 3 <-> 4 <-> 5 <-> 6

target = 7
```

### Output
```text
[1, 6]
[2, 5]
[3, 4]
```

## Time Complexity
- **O(n)**

## Space Complexity
- **O(p)**
