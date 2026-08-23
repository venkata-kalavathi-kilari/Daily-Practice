# Segregate 0s, 1s and 2s in a Linked List

## Problem
Given a linked list containing only `0`, `1`, and `2`, segregate the nodes so that all `0`s come first, followed by all `1`s, and then all `2`s.

## Algorithm
1. Create an array `count` of size 3 to store the frequency of `0`, `1`, and `2`.
2. Traverse the linked list and count how many times each value occurs.
3. Traverse the linked list again.
4. Replace each node's data with the required value:
   - First fill all `0`s.
   - Then fill all `1`s.
   - Finally fill all `2`s.
5. Return the original head.

## Example

### Input
0 -> 1 -> 2 -> 1 -> 2 -> 0 -> 1

### Output
0 -> 0 -> 1 -> 1 -> 1 -> 2 -> 2

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**
